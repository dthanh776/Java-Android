/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import ET.ET_PhatSinh;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.database;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author dthan
 */
public class DAL_PhatSinh {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet hienThiPhatSinh() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from phatsinh ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO phatsinh(SoPhieu, NgayLap, MaKH)"
                + "VALUES(?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhatSinh.getSoPhieu());
            pst.setDate(2, et_PhatSinh.getNgayLap());
            pst.setString(3, et_PhatSinh.getMaKH());

            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean checkTonTaiPhatSinh(String soPhieu) throws SQLException {

        int row = 0;
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from phatsinh where SoPhieu = '" + soPhieu + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public Boolean suaPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE phatsinh SET NgayLap = ?, MaKH = ? WHERE SoPhieu = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(3, et_PhatSinh.getSoPhieu());
            pst.setDate(1, et_PhatSinh.getNgayLap());
            pst.setString(2, et_PhatSinh.getMaKH());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM phatsinh WHERE SoPhieu = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhatSinh.getSoPhieu());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet laySoPhieu_KhachHang(String maKhachHang) throws Exception {
        Connection conn = null;
        conn = database.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * FROM phatsinh WHERE MaKH ='" + maKhachHang + "'";
        rs = st.executeQuery(sql);
        return rs;
    }

    public String tongSoPhieu(String maKhachHang) throws Exception {
        
        conn = database.getConnection();
        Statement st = conn.createStatement();
        String sql = "select count(MaKH) FROM phatsinh WHERE MaKH ='" + maKhachHang + "'";
        rs = st.executeQuery(sql);
        String s = "";
        while (rs.next()) {
            s = rs.getObject(1).toString();
            break;
        }
        return s;
    }
}

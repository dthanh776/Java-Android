/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import ET.ET_DichVu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.database;
import java.awt.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author dthan
 */
public class DAL_DichVu {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet hienThiDichVu() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from dichvu ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themDichVu(ET_DichVu et_dichVu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO dichvu(MaDV, TenDV, DVT, donGia)"
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_dichVu.getMaDV());
            pst.setString(2, et_dichVu.getTenDV());
            pst.setString(3, et_dichVu.getDVT());
            pst.setInt(4, et_dichVu.getDonGia());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean checkTonTaiDichVu(String maDichVu) throws SQLException {

        int row = 0;
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from dichvu where MaDV = '" + maDichVu + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public Boolean suaDichVu(ET_DichVu et_dichVu) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE dichvu SET TenDV = ?, DVT = ?,DonGia = ? WHERE MaDV = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(4, et_dichVu.getMaDV());
            pst.setString(1, et_dichVu.getTenDV());
            pst.setString(2, et_dichVu.getDVT());
            pst.setInt(3, et_dichVu.getDonGia());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaDichVu(ET_DichVu et_dichVu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM dichvu WHERE MaDV = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_dichVu.getMaDV());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String layDichVu(String maDichVu) throws Exception {
        conn = database.getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from dichvu where MaDV = '" + maDichVu + "'";
        rs = st.executeQuery(sql);
        String madv = "";
        while (rs.next()) {
            madv = rs.getObject(2).toString();
            break;
        }
        return madv;
    }

    public String layGiaDichVu(String maDichVu) throws Exception {
        conn = database.getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from dichvu where MaDV = '" + maDichVu + "'";
        rs = st.executeQuery(sql);
        String madv = "";
        while (rs.next()) {
            madv = rs.getObject(4).toString();
            break;
        }
        return madv;
    }
        public ResultSet sapXep() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from dichvu order by MaDV DESC ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}

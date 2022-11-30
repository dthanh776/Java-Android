/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import ET.ET_KhacHang;
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
public class DAL_KhachHang {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet hienThiKhacHang() throws SQLException, Exception {

        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from khachang ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themKhachHang(ET_KhacHang et_khachHang) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO khachang(MaKH, TenKH, NgaySinh,DiaChi)"
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_khachHang.getMaKH());
            pst.setString(2, et_khachHang.getTenKH());
            pst.setDate(3, et_khachHang.getNgaySinh());
            pst.setString(4, et_khachHang.getDiaChi());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean checkTonTaiKhachHang(String maKhachHang) throws SQLException {

        int row = 0;
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from khachang where MaKH = '" + maKhachHang + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public Boolean suaKhachHang(ET_KhacHang et_khachHang) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE khachang SET TenKH = ?, NgaySinh = ?,DiaChi = ? WHERE MaKH = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(4, et_khachHang.getMaKH());
            pst.setString(1, et_khachHang.getTenKH());
            pst.setDate(2, et_khachHang.getNgaySinh());
            pst.setString(3, et_khachHang.getDiaChi());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaKhachHang(ET_KhacHang et_khachHang) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM khachang WHERE MaKH = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_khachHang.getMaKH());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet layKhachHang(String maKhachHang) throws Exception {
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * FROM khachang WHERE MaKH ='" + maKhachHang + "'";
        rs = st.executeQuery(sql);
        return rs;
    }

    public ResultSet sapXepKhachHang() throws SQLException, Exception {

        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from khachang order by MaKH desc";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

}

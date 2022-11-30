/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import ET.ET_PhieuThu;
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
public class DAL_PhieuThu {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet hienThiPhieuThu() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from phieuthu ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO phieuthu(SoPT, MaKH, Ngay, SoTien)"
                + "VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhieuThu.getSoPT());
            pst.setString(2, et_PhieuThu.getMaKH());
            pst.setDate(3, et_PhieuThu.getNgay());
            pst.setInt(4, et_PhieuThu.getSoTien());

            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean checkTonTaiPhieuThu(String soPT) throws SQLException {

        int row = 0;
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from phieuthu where SoPT = '" + soPT + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public Boolean suaPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE phieuthu SET MaKH = ?, Ngay = ?,SoTien = ? WHERE SoPT = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(4, et_PhieuThu.getSoPT());
            pst.setString(1, et_PhieuThu.getMaKH());
            pst.setDate(2, et_PhieuThu.getNgay());
            pst.setInt(3, et_PhieuThu.getSoTien());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM phieuthu WHERE SoPT = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhieuThu.getSoPT());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ResultSet sapXepPhieuThu() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from phieuthu order by SoPT desc ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}

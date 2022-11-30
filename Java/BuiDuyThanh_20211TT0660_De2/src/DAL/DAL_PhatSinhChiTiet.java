/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import ET.ET_PhatSinhChiTiet;
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
public class DAL_PhatSinhChiTiet {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet hienThiPhatSinhChiTiet() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from phatsinhchitiet ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO phatsinhchitiet(SoPhieu, MaDV, SoLuong)"
                + "VALUES(?, ?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhatSinhChiTiet.getSoPhieu());
            pst.setString(2, et_PhatSinhChiTiet.getMaDV());
            pst.setInt(3, et_PhatSinhChiTiet.getSoLuong());

            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean suaPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE phatsinhchitiet SET SoLuong = ? WHERE SoPhieu = ? and MaDV = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(2, et_PhatSinhChiTiet.getSoPhieu());
            pst.setString(3, et_PhatSinhChiTiet.getMaDV());
            pst.setInt(1, et_PhatSinhChiTiet.getSoLuong());

            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM phatsinhchitiet WHERE SoPhieu = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et_PhatSinhChiTiet.getSoPhieu());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String tinhTien(String thanhTien) throws SQLException, Exception {

        conn = database.getConnection();
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String sql = "SELECT phatsinhchitiet.SoPhieu, dichvu.MaDV, phatsinhchitiet.SoLuong , dichvu.DonGia, "
                + "(phatsinhchitiet.SoLuong * dichvu.DonGia) as 'Thanh tien' FROM phatsinhchitiet , dichvu WHERE phatsinhchitiet.MaDV = dichvu.MaDV AND dichvu.MaDV ='" + thanhTien + "'  ";
        rs = st.executeQuery(sql);
        String s = "";
        while (rs.next()) {
            s = rs.getObject(5).toString();
            break;
        }
        return s;
    }

    public ResultSet timPhatSinh(String soPhieu) throws SQLException {

        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from phatsinhchitiet where SoPhieu = '" + soPhieu + "'";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public String tongSoMuc(String soPhieu) throws Exception {

        conn = database.getConnection();
        Statement st = conn.createStatement();
        String sql = "select count(SoPhieu) FROM phatsinhchitiet WHERE SoPhieu ='" + soPhieu + "'";
        rs = st.executeQuery(sql);
        String s = "";
        while (rs.next()) {
            s = rs.getObject(1).toString();
            break;
        }
        return s;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import connection.database;
import javax.swing.JOptionPane;

/**
 *
 * @author dthan
 */
public class DAL_ThongKe {

    Connection conn = null;
    ResultSet rs = null;

    public ResultSet chiTietPhieu() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT phatsinhchitiet.SoPhieu,dichvu.MaDV, dichvu.TenDV, phatsinhchitiet.SoLuong , dichvu.DonGia, (phatsinhchitiet.SoLuong * dichvu.DonGia) as 'Thanh tien' FROM phatsinhchitiet , dichvu, phatsinh WHERE phatsinhchitiet.MaDV = dichvu.MaDV and phatsinhchitiet.SoPhieu = phatsinh.SoPhieu ";
            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet chiTietChuot() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT phatsinhchitiet.SoPhieu,dichvu.MaDV, dichvu.TenDV, sum( phatsinhchitiet.SoLuong) , dichvu.DonGia, sum(phatsinhchitiet.SoLuong * dichvu.DonGia) as 'Thanh tien' FROM phatsinhchitiet , dichvu, phatsinh WHERE phatsinhchitiet.MaDV = dichvu.MaDV and phatsinhchitiet.SoPhieu = phatsinh.SoPhieu and dichvu.MaDV ='Chuot' ";
            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
        public ResultSet chiTietSoLuong() throws SQLException, Exception {
        try {
            conn = database.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT phatsinhchitiet.SoPhieu,dichvu.MaDV, dichvu.TenDV, sum(phatsinhchitiet.SoLuong) , dichvu.DonGia FROM phatsinhchitiet , dichvu, phatsinh WHERE phatsinhchitiet.MaDV = dichvu.MaDV and phatsinhchitiet.SoPhieu = phatsinh.SoPhieu GROUP BY dichvu.MaDV ";
            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}

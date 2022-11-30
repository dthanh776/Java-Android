/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_KhachHang;
import ET.ET_KhacHang;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_KhacHang {

    DAL_KhachHang dal_khachHang;

    public BLL_KhacHang() {
        dal_khachHang = new DAL_KhachHang();
    }

    public ResultSet hienThiKhachHang() throws Exception {
        return dal_khachHang.hienThiKhacHang();
    }

    public boolean themKhachHang(ET_KhacHang et_KhachHang) throws SQLException {
        return dal_khachHang.themKhachHang(et_KhachHang);
    }

    public boolean checkTonTaiKhachHang(String ma) throws SQLException {
        return dal_khachHang.checkTonTaiKhachHang(ma);
    }

    public boolean suaKhachHang(ET_KhacHang et_KhachHang) throws SQLException {
        return dal_khachHang.suaKhachHang(et_KhachHang);
    }

    public boolean xoaKhachHang(ET_KhacHang et_KhachHang) throws SQLException {
        return dal_khachHang.xoaKhachHang(et_KhachHang);
    }

    public ResultSet layKhachHang(String maKhachHang) throws SQLException, Exception {
        return dal_khachHang.layKhachHang(maKhachHang);
    }

    public ResultSet sapXepKhachHang() throws Exception {
        return dal_khachHang.sapXepKhachHang();
    }
}

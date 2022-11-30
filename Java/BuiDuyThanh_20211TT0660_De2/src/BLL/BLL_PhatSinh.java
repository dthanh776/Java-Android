/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_PhatSinh;
import ET.ET_KhacHang;
import ET.ET_PhatSinh;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_PhatSinh {

    DAL_PhatSinh dal_phatSinh;

    public BLL_PhatSinh() {
        dal_phatSinh = new DAL_PhatSinh();
    }

    public ResultSet hienThiPhatSinh() throws Exception {
        return dal_phatSinh.hienThiPhatSinh();
    }

    public boolean themPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {
        return dal_phatSinh.themPhatSinh(et_PhatSinh);
    }

    public boolean checkTonTaiPhatSinh(String soPhieu) throws SQLException {
        return dal_phatSinh.checkTonTaiPhatSinh(soPhieu);
    }

    public boolean suaPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {
        return dal_phatSinh.suaPhatSinh(et_PhatSinh);
    }

    public boolean xoaPhatSinh(ET_PhatSinh et_PhatSinh) throws SQLException {
        return dal_phatSinh.xoaPhatSinh(et_PhatSinh);
    }

    public ResultSet laySoPhieu_KhachHang(String maKhachHang) throws SQLException, Exception {
        return dal_phatSinh.laySoPhieu_KhachHang(maKhachHang);
    }

    public String tongSoPhieu(String maPhieu) throws SQLException, Exception {
        return dal_phatSinh.tongSoPhieu(maPhieu);
    }
}

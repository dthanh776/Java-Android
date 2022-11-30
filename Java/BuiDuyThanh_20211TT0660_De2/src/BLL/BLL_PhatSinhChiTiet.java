/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_PhatSinhChiTiet;
import ET.ET_PhatSinhChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_PhatSinhChiTiet {

    DAL_PhatSinhChiTiet dal_phatSinhChiTiet;

    public BLL_PhatSinhChiTiet() {
        dal_phatSinhChiTiet = new DAL_PhatSinhChiTiet();
    }

    public ResultSet hienThiPhatSinhChiTiet() throws Exception {
        return dal_phatSinhChiTiet.hienThiPhatSinhChiTiet();
    }

    public boolean themPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {
        return dal_phatSinhChiTiet.themPhatSinhChiTiet(et_PhatSinhChiTiet);
    }

    public boolean suaPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {
        return dal_phatSinhChiTiet.suaPhatSinhChiTiet(et_PhatSinhChiTiet);
    }

    public boolean xoaPhatSinhChiTiet(ET_PhatSinhChiTiet et_PhatSinhChiTiet) throws SQLException {
        return dal_phatSinhChiTiet.xoaPhatSinhChiTiet(et_PhatSinhChiTiet);
    }

    public ResultSet timPhatSinh(String soPhieu) throws SQLException, Exception {
        return dal_phatSinhChiTiet.timPhatSinh(soPhieu);
    }

    public String tongSoMuc(String maPhieu) throws SQLException, Exception {
        return dal_phatSinhChiTiet.tongSoMuc(maPhieu);
    }

    public String tinhTien(String thanhTien) throws Exception {
        return dal_phatSinhChiTiet.tinhTien(thanhTien);
    }

}

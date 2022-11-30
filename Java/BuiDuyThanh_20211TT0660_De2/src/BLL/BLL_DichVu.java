/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_DichVu;
import ET.ET_DichVu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_DichVu {

    DAL_DichVu dal_dichVu;

    public BLL_DichVu() {
        dal_dichVu = new DAL_DichVu();
    }

    public ResultSet hienThiDichVu() throws Exception {
        return dal_dichVu.hienThiDichVu();
    }

    public boolean themDichVu(ET_DichVu et_dichVu) throws SQLException {
        return dal_dichVu.themDichVu(et_dichVu);
    }

    public boolean checkTonTaiDichVu(String ma) throws SQLException {
        return dal_dichVu.checkTonTaiDichVu(ma);
    }

    public boolean suaDichVu(ET_DichVu et) throws SQLException {
        return dal_dichVu.suaDichVu(et);
    }

    public boolean xoaDichVu(ET_DichVu et) throws SQLException {
        return dal_dichVu.xoaDichVu(et);
    }

    public String layTenDichVu(String maDv) throws Exception {
        return dal_dichVu.layDichVu(maDv);
    }

    public String layGiaDichVu(String maDv) throws Exception {
        return dal_dichVu.layGiaDichVu(maDv);
    }

    public ResultSet sapXep() throws Exception {
        return dal_dichVu.sapXep();
    }
}

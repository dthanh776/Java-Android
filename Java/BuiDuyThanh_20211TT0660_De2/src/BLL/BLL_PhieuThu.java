/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_PhieuThu;
import ET.ET_PhieuThu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_PhieuThu {

    DAL_PhieuThu dal_phieuThu;

    public BLL_PhieuThu() {
        dal_phieuThu = new DAL_PhieuThu();
    }

    public ResultSet hienThiPhieuThu() throws Exception {
        return dal_phieuThu.hienThiPhieuThu();
    }

    public boolean themPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {
        return dal_phieuThu.themPhieuThu(et_PhieuThu);
    }

    public boolean checkTonTaiPhieuThu(String phieuThu) throws SQLException {
        return dal_phieuThu.checkTonTaiPhieuThu(phieuThu);
    }

    public boolean suaPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {
        return dal_phieuThu.suaPhieuThu(et_PhieuThu);
    }

    public boolean xoaPhieuThu(ET_PhieuThu et_PhieuThu) throws SQLException {
        return dal_phieuThu.xoaPhieuThu(et_PhieuThu);
    }

    public ResultSet sapXepPhieuThu() throws Exception {
        return dal_phieuThu.sapXepPhieuThu();
    }
}

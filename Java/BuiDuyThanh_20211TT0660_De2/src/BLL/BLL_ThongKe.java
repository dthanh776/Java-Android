/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_ThongKe;
import ET.ET_PhieuThu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_ThongKe {

    DAL_ThongKe dal_ThongKe;

    public BLL_ThongKe() {
        dal_ThongKe = new DAL_ThongKe();
    }

    public ResultSet hienThiPhieuThu() throws Exception {
        return dal_ThongKe.chiTietPhieu();
    }

    public ResultSet chiTietChuot() throws Exception {
        return dal_ThongKe.chiTietChuot();
    }
        public ResultSet chiTietSoLuong() throws Exception {
        return dal_ThongKe.chiTietSoLuong();
    }
}

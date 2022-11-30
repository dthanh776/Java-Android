/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20211tt0660_buiduythanh_ktgk;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author dthan
 */
public class DSThuocTay {

    private ArrayList<ThuocTay> al_ThuocTay;

    public DSThuocTay() {
        al_ThuocTay = new ArrayList<>();
    }

    public ArrayList<ThuocTay> getAl_ThuocTay() {
        return al_ThuocTay;
    }

    public void setAl_ThuocTay(ArrayList<ThuocTay> al_ThuocTay) {
        this.al_ThuocTay = al_ThuocTay;
    }

    public void themThuocTay(ThuocTay tt) {
        al_ThuocTay.add(tt);
    }

    public void suaThuocTay(ThuocTay tt) {
        for (ThuocTay thuocTay : al_ThuocTay) {
            if (tt.getMaThuoc() == thuocTay.getMaThuoc()) {
                thuocTay.setTenThuoc(tt.getTenThuoc());
                thuocTay.setDonViTinh(tt.getDonViTinh());
                thuocTay.setDonGia(tt.getDonGia());
                break;
            }
        }
    }

    public void xoaThuocTay(String maThuoc) {
        for (ThuocTay thuocTay : al_ThuocTay) {
            if (maThuoc == thuocTay.getMaThuoc()) {
                al_ThuocTay.remove(thuocTay);
                break;
            }
        }
    }

    public String hienThiThuocTay() {
        String tt = "";
        for (ThuocTay thuocTay : al_ThuocTay) {
            tt += thuocTay.toString() + "\n";
        }
        return tt;
    }

    public ThuocTay timThuocTay(int donGia) {

        for (ThuocTay thuocTay : al_ThuocTay) {
            if (donGia == thuocTay.getDonGia()) {
                return thuocTay;
            }
        }
        return null;
    }
}

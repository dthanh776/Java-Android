package com.example.myapplication;

import android.text.Editable;

import java.io.Serializable;

public class TinhTienDien implements Serializable {
    String loaiSuDung, hoTen;
    double chiSoDau, chiSoCuoi, heSo, thanhTien, phuTroi, tongCong;

    public TinhTienDien() {

    }

    public TinhTienDien(String hoTen, String loaiSuDung, double chiSoDau, double chiSoCuoi) {
        this.hoTen = hoTen;
        this.loaiSuDung = loaiSuDung;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        if (loaiSuDung.equals("Gia Dinh")) {
            this.heSo = 1;
        } else {
            this.heSo = 2;
        }
        this.thanhTien = (this.chiSoCuoi - this.chiSoDau) * this.heSo * 550;

        if (this.chiSoCuoi - this.chiSoDau < 50) {
            this.phuTroi = 0;
        }
        if (50 <= (this.chiSoCuoi - this.chiSoDau) && (this.chiSoCuoi - this.chiSoDau) <= 100) {
            this.phuTroi = thanhTien * 0.35;
        } else {
            this.phuTroi = thanhTien;
        }
        this.tongCong = phuTroi + thanhTien;

    }

    public String getLoaiSuDung() {
        return loaiSuDung;
    }

    public void setLoaiSuDung(String loaiSuDung) {
        this.loaiSuDung = loaiSuDung;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getChiSoDau() {
        return chiSoDau;
    }

    public void setChiSoDau(double chiSoDau) {
        this.chiSoDau = chiSoDau;
    }

    public double getChiSoCuoi() {
        return chiSoCuoi;
    }

    public void setChiSoCuoi(double chiSoCuoi) {
        this.chiSoCuoi = chiSoCuoi;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getPhuTroi() {
        return phuTroi;
    }

    public void setPhuTroi(double phuTroi) {
        this.phuTroi = phuTroi;
    }

    public double getTongCong() {
        return tongCong;
    }

    public void setTongCong(double tongCong) {
        this.tongCong = tongCong;
    }
}

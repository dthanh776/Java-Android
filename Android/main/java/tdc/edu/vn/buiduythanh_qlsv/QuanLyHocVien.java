package tdc.edu.vn.buiduythanh_qlsv;

import java.io.Serializable;

public class QuanLyHocVien implements Serializable {
    String tenHocVien, monHoc;
    int soTinChi, thanhTien;

    public QuanLyHocVien() {
    }

    public QuanLyHocVien(String tenHocVien, String monHoc, int soTinChi) {
        this.tenHocVien = tenHocVien;
        this.monHoc = monHoc;
        this.soTinChi = soTinChi;
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getThanhTien() {
        this.thanhTien = this.soTinChi * 450000;
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
}

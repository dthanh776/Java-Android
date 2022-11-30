/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STT_HoTen_Monhoc;

/**
 *
 * @author dthan
 */
public class MonHoc {
            private String maMonHoc, tenMon;
            private int soTinChi;

    public MonHoc(String maKhoa, String tenKhoa) {
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public MonHoc(String maMonHoc, String tenMon, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMonHoc=" + maMonHoc + ", tenMon=" + tenMon + ", soTinChi=" + soTinChi + '}';
    }
}

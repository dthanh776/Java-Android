/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlmonhoc1;

/**
 *
 * @author dthan
 */
public class MonHoc {
    private String maMon;
    private String tenMon;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public MonHoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMon=" + maMon + ", tenMon=" + tenMon + ", soTinChi=" + soTinChi + '}';
    }

    void getTenMon(String tenMon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

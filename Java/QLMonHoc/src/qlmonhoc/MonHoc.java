/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlmonhoc;

/**
 *
 * @author dthan
 */
public class MonHoc {
    public String MaMon;
    public String TenMon;
    public int TinChi;

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getTinChi() {
        return TinChi;
    }

    public void setTinChi(int TinChi) {
        this.TinChi = TinChi;
    }

    public MonHoc(String MaMon, String TenMon, int TinChi) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.TinChi = TinChi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "MaMon=" + MaMon + ", TenMon=" + TenMon + ", TinChi=" + TinChi + '}';
    }
    
}


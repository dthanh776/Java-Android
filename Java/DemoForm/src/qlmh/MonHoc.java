/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlmh;

/**
 *
 * @author yushu
 */
public class MonHoc {

    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }
   
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + ", soTinChi=" + soTinChi + '}';
    }
}

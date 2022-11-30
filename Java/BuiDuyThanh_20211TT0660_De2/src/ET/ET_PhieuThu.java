/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ET;

import java.util.Date;

/**
 *
 * @author dthan
 */
public class ET_PhieuThu {

    private String soPT;
    private String maKH;
    java.sql.Date ngay;
    private int SoTien;

    public String getSoPT() {
        return soPT;
    }

    public void setSoPT(String soPT) {
        this.soPT = soPT;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public java.sql.Date getNgay() {
        return ngay;
    }

    public void setNgay(java.sql.Date ngay) {
        this.ngay = ngay;
    }

    public int getSoTien() {
        return SoTien;
    }

    public void setSoTien(int SoTien) {
        this.SoTien = SoTien;
    }

    public ET_PhieuThu(String soPT, String maKH, java.sql.Date ngay, int SoTien) {
        this.soPT = soPT;
        this.maKH = maKH;
        this.ngay = ngay;
        this.SoTien = SoTien;
    }


}

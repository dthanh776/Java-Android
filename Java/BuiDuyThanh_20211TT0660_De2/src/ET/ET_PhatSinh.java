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
public class ET_PhatSinh {

    private String soPhieu;
    java.sql.Date ngayLap;
    private String maKH;

    public ET_PhatSinh(String soPhieu, java.sql.Date ngayLap, String maKH) {
        this.soPhieu = soPhieu;
        this.ngayLap = ngayLap;
        this.maKH = maKH;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public java.sql.Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(java.sql.Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

}

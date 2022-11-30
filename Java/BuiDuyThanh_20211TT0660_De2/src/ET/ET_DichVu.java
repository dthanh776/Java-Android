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
public class ET_DichVu {

    private String maDV;
    private String tenDV;
    private String DVT;
    private int donGia;

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public ET_DichVu(String maDV, String tenDV, String DVT, int donGia) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.DVT = DVT;
        this.donGia = donGia;
    }
    
}

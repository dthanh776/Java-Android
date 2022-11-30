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
public class ET_KhacHang {

    private String maKH;
    private String tenKH;
    java.sql.Date ngaySinh;
    private String diaChi;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public java.sql.Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(java.sql.Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ET_KhacHang(String maKH, String tenKH, java.sql.Date ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }



}

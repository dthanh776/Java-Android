/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_khoa;

/**
 *
 * @author dthan
 */
public class Khoa {

    private String maKhoa, tenKhoa;

    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public Khoa() {
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "Khoa{" + "maKhoa=" + maKhoa + ", tenKhoa=" + tenKhoa + '}';
    }

}

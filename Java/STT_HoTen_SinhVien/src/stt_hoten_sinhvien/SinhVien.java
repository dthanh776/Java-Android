/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_sinhvien;

/**
 *
 * @author Thanh
 */
public class SinhVien {
    private String ma, hoTen;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, int tuoi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", hoTen=" + hoTen + ", tuoi=" + tuoi + '}';
    }
    
    
}


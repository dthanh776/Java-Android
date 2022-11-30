/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Thanh
 */
public class HinhChuNhat {

    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }

    public int tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public int tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }
}

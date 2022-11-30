/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20211tt0660_buiduythanh_ktgk;

/**
 *
 * @author dthan
 */
public class ThuocTay {
    private String maThuoc;
    private String tenThuoc;
    private int donViTinh;
    private int donGia;

    public ThuocTay(String maThuoc, String tenThuoc, int donViTinh, int donGia) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(int donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "ThuocTay{" + "maThuoc=" + maThuoc + ", tenThuoc=" + tenThuoc + ", donViTinh=" + donViTinh + ", donGia=" + donGia + '}';
    }
    
}

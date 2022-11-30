/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qllphanso;

/**
 *
 * @author Thanh
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return "PhanSo{" + "tuSo=" + tuSo + ", mauSo=" + mauSo + '}';
    }
    // toi gian
    //1. USCLN
    //2. ts/USCLN
    //3. ms/USCLN
    public void ToiGian() {
    // tim USCLN
    int UCLN = UCLN(tuSo,mauSo);
    tuSo = tuSo / UCLN;
    mauSo = mauSo / UCLN;
    }
    // + (a1*b2 + a2*b1) / b1*b2
    // - (a1*b2 - a2*b1) / b1*b2
    // * a1*a2 / b1*b2
    // / a1*b2 / b1*a2
    public void CongPhanSo(PhanSo ps) {
        tuSo = this.tuSo * ps.getMauSo() + ps.getTuSo() * this.mauSo;
        mauSo = this.mauSo * ps.mauSo;
    }

    public void TruPhanSo(PhanSo ps) {
        tuSo = this.tuSo * ps.getMauSo() - ps.getTuSo() * this.mauSo;
        mauSo = this.mauSo * ps.mauSo;
    }

    public void NhanPhanSo(PhanSo ps) {
        this.tuSo = this.tuSo * ps.getTuSo();
        this.mauSo =this.mauSo * ps.getMauSo();
    }

    public void ChiaPhanSo(PhanSo ps) {
        tuSo = this.tuSo * ps.getMauSo();
        mauSo = ps.getTuSo() * ps.getTuSo();
    }
}

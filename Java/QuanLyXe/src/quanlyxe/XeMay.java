/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe;

/**
 *
 * @author dthan
 */
public class XeMay extends Xe {

    private int chiphiSX;

    public int getChiphiSX() {
        return chiphiSX;
    }

    public void setChiphiSX(int chiphiSX) {
        this.chiphiSX = chiphiSX;
    }

    public XeMay(int chiphiSX) {
        super();
        this.chiphiSX = chiphiSX;
    }

    public XeMay(int chiphiSX, String nhaSX, int namSX) {
        super(nhaSX, namSX);
        this.chiphiSX = chiphiSX;
    }

    public int tinhGiaBan() {
        return 2 * chiphiSX;
    }

    public int tinhGiaBan(int hoaHong) {
        return (2 * chiphiSX + hoaHong);
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString() + "chiphiSX=" + chiphiSX + '}';
    }
}

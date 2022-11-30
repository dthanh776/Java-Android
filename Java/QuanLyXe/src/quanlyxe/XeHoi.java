/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe;

/**
 *
 * @author dthan
 */
public class XeHoi extends Xe {

    private int chiPhiSX;

    public XeHoi(int chiPhiSX, String nhaSX, int namSX) {
        super(nhaSX, namSX);
        this.chiPhiSX = chiPhiSX;
    }

    public int tinhGiaBan() {
        return 4 * chiPhiSX;
    }

    public int tinhGiaBan(int hoaHong) {
        return (4 * chiPhiSX + hoaHong);
    }

    @Override
    public String toString() {
        return "XeHoi{" + super.toString() + "chiPhiSX=" + chiPhiSX + '}';
    }
}

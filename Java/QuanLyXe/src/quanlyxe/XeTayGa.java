/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe;

/**
 *
 * @author dthan
 */
public class XeTayGa extends XeMay {

    public XeTayGa(int chiphiSX) {
        super(chiphiSX);
    }

    public XeTayGa(int chiphiSX, String nhaSX, int namSX) {
        super(chiphiSX, nhaSX, namSX);
    }

    public int tinhGiaBan() {
        return 3 * super.getChiphiSX();
    }
        public int tinhGiaBan(int hoaHong) {
        return 3 * super.getChiphiSX() + hoaHong;
    }

    @Override
    public String toString() {
        return "XeTayGa{" + super.toString() +'}';
    }
}

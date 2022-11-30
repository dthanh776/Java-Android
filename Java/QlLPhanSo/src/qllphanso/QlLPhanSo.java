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
public class QlLPhanSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo ps = new PhanSo(3, 5);
        System.out.println(ps.toString());

        ps.CongPhanSo(new PhanSo(3, 5));
        System.out.println(ps.toString());

        ps.TruPhanSo(new PhanSo(3, 5));
        System.out.println(ps.toString());

        ps.NhanPhanSo(new PhanSo(3, 5));
        System.out.println(ps.toString());

        ps.ChiaPhanSo(new PhanSo(3, 5));
        System.out.println(ps.toString());

        PhanSo ps1 = new PhanSo(16, 4);
        PhanSo ps2 = new PhanSo(4, 8);

        ps1.CongPhanSo(ps2);
        System.out.println(ps1.toString());
        ps1.NhanPhanSo(ps2);
        System.out.println(ps1.toString());
    }
    
}

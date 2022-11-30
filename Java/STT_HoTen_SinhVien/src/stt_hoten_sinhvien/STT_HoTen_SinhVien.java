/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_sinhvien;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class STT_HoTen_SinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        DSSinhVien dsSinhVien = new DSSinhVien();

        SinhVien sv1 = new SinhVien("1", "duy",8);        
        SinhVien sv2 = new SinhVien("2", "thanh",9);
        
        dsSinhVien.themDS(sv1);
        dsSinhVien.themDS(sv2);
        dsSinhVien.hienThiDS();
        
        System.out.println("Nhap sinh vien muon xoa: ");
        String mssv = input.nextLine();
        dsSinhVien.xoaDS(mssv);
        dsSinhVien.hienThiDS();
        
        
        
    }
    
}

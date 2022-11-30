/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_khoa;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dthan
 */
public class STT_HoTen_Khoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        DSKhoa ds = new DSKhoa();
        
        Khoa kh1 = new Khoa("CD20TT1", "Cong Nghe Thong Tin");
        Khoa kh2 = new Khoa("CD20OT1", "O To");
        
        ds.ThemDSKhoa(kh1);
        ds.ThemDSKhoa(kh2);
        ds.XuatDSKhoa();
        
        System.out.println("Nhap ma khoa ban muon xoa");
        String msKhoa = input.nextLine();
        ds.XoaDSKhoa(msKhoa);
        ds.XuatDSKhoa();
        
        ds.ghiDanhSach("data.txt");
    }
    
}

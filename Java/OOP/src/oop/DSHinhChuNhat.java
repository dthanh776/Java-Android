/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class DSHinhChuNhat {

    Scanner input = new Scanner(System.in);
    private ArrayList<HinhChuNhat> dsHCN;

    public DSHinhChuNhat() {
        dsHCN = new ArrayList<>();
    }

    public void NhapDS() {
            System.out.print("Nhap chieu dai: ");
            int cd = input.nextInt();
            System.out.print("Nhap chieu rong: ");
            int cr = input.nextInt();
            HinhChuNhat hcn = new HinhChuNhat(cd, cr);
            dsHCN.add(hcn);
    }

    public void XuatDS() {
        for (HinhChuNhat hinhChuNhat : dsHCN) {
            System.out.println(hinhChuNhat.toString());
        }
    }

    // tim dien tich lon nhat
    public void XuatMax() {
        HinhChuNhat hcn = new HinhChuNhat();
        for (HinhChuNhat hinhChuNhat : dsHCN) {
            if (hcn.tinhDienTich() < hinhChuNhat.tinhDienTich())
                hcn = hinhChuNhat;
        }
        System.out.println("Dien tich: " + hcn.tinhDienTich());
        System.out.println(hcn.toString());
    }
    // tong chu vi cua ds hcn
    public void TongCV() {
        int sum = 0;
        for (HinhChuNhat i : dsHCN) {
            sum += i.tinhChuVi();
        }
        System.out.println("Tong Chu Vi HCN: "+ sum);
    }
}

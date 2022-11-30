/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyxe;

import java.util.ArrayList;

/**
 *
 * @author dthan
 */
public class DSXe {

    private ArrayList<Xe> list = new ArrayList<>();

    public void themXe() {
        list.add(new XeMay(100, "HonDa", 2000));
        list.add(new XeHoi(1000, "ToYoTa", 2000));
        list.add(new XeTayGa(300, "Lead", 2000));
    }

    public void hienThiXe() {
        //danh sach xe
        for (Xe xe : list) {
            System.out.println(xe.toString());
        }
    }

    public void hienThiXeMay() {
        for (Xe xe : list) {
            if (xe instanceof XeMay) {
                System.out.println(xe.toString());
            }
        }
    }

    public void hienThiXeHoi() {
        for (Xe xe : list) {
            if (xe instanceof XeHoi) {
                System.out.println(xe.toString());
            }
        }
    }

    public int tongGiaBanXeHoi() {
        int tong = 0;
        for (Xe xe : list) {
            if (xe instanceof XeHoi) {
                tong += ((XeHoi) xe).tinhGiaBan();
            }
        }
        return tong;
    }

    public ArrayList<Xe> hienThiXe1() {
        ArrayList<Xe> al = new ArrayList<>();
        // danh sach xe
        for (Xe xe : list) {
            al.add(xe);
        }
        return al;
    }

    
}

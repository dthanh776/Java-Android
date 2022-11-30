/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlyxe;

import java.util.ArrayList;

/**
 *
 * @author dthan
 */
public class QuanLyXe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Xe> list = new ArrayList<>();
        list.add(new XeMay(100, "HonDa", 2000));
        list.add(new XeHoi(1000, "ToYoTa", 2000));
        list.add(new XeTayGa(300, "Lead", 2000));
        //danh sách xe
        for (Xe xe : list) {
            System.out.println(xe.toString());
        }

        DSXe dsxe = new DSXe();
        dsxe.themXe();
        dsxe.hienThiXeMay();
        dsxe.hienThiXeHoi();
        
        System.out.println(dsxe.tongGiaBanXeHoi());
    }

}

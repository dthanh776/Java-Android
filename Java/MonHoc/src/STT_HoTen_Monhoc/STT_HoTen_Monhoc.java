/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STT_HoTen_Monhoc;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dthan
 */
public class STT_HoTen_Monhoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DSMonHoc ds = new DSMonHoc();

        MonHoc mh1 = new MonHoc("1", "java", 5);
        MonHoc mh2 = new MonHoc("2", "c#", 4);
        MonHoc mh3 = new MonHoc("mh3", "php", 2);

        ds.themDS(mh1);
        ds.themDS(mh2);
        ds.themDS(mh3);
        ds.XuatDS();
        ds.sapXepTangTC();
        System.out.println("Sap xep tin chi tang");
        ds.XuatDS();
        
        ds.sapXepTenMon();
        System.out.println("Sap xep mon hoc tang");
        ds.XuatDS();     
    }

}

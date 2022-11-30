/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_khoa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author dthan
 */
public class DSKhoa {

    private ArrayList<Khoa> al_Khoa;

    public DSKhoa() {
        al_Khoa = new ArrayList<>();
    }

    public void ThemDSKhoa(Khoa kh) {
        al_Khoa.add(kh);
    }

    public void XoaDSKhoa(String maKhoa) {
        for (Khoa khoa : al_Khoa) {
            if (khoa.getMaKhoa().equals(maKhoa)) {
                al_Khoa.remove(khoa);
                break;
            }
        }
    }

    public void XuatDSKhoa() {
        for (Khoa khoa : al_Khoa) {
            System.out.println(khoa.toString());
        }
    }

    public void suaKhoa(Khoa kh) {
        for (Khoa khoa : al_Khoa) {
            if (khoa.getMaKhoa().equals(kh.getMaKhoa())) {
                khoa.setTenKhoa(kh.getTenKhoa());
            }

        }
    }

    public void ghiDanhSach(String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        for (Khoa khoa : al_Khoa) {
            String str = khoa.getMaKhoa() + ";" + khoa.getTenKhoa();
            fw.write(str);
        }
        fw.close();
    }

    public void docDanhSach(String filename) throws FileNotFoundException, IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        al_Khoa.clear();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(";");
            Khoa khoa = new Khoa(str[0],str[1]);
            al_Khoa.add(khoa);
        }
        fr.close();
        br.close();
    }
}

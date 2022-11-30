/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlmonhoc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dthan
 */
public class DSMonHoc {

    private ArrayList<MonHoc> al_MonHoc;

    public ArrayList<MonHoc> getAl_MonHoc() {
        return al_MonHoc;
    }

    public void setAl_MonHoc(ArrayList<MonHoc> al_MonHoc) {
        this.al_MonHoc = al_MonHoc;
    }

    public DSMonHoc() {
        al_MonHoc = new ArrayList<>();
    }

    public void themMonHoc(MonHoc mh) {
        al_MonHoc.add(mh);
    }

    public void xoaMonHoc(MonHoc mh) {
        for (MonHoc monHoc : al_MonHoc) {
            if (monHoc.getMaMon().equals(mh.getMaMon())) {
                al_MonHoc.remove(monHoc);
                break;
            }
        }
    }

    public void suaMonHoc(MonHoc mh) {
        for (MonHoc monHoc : al_MonHoc) {
            if (monHoc.getMaMon().equals(mh.getMaMon())) {
                monHoc.setTenMon(mh.getTenMon());
            }
            monHoc.setTinChi(mh.getTinChi());
        }
    }

    public String hienThiMonHoc() {
        String mh = "";
        for (MonHoc monHoc : al_MonHoc) {
            mh += monHoc.toString() + "\n";
        }
        return mh;
    }

    public MonHoc timMonHoc(MonHoc mh) {
        for (MonHoc monHoc1 : al_MonHoc) {
            if (monHoc1.getMaMon().equals(mh.getMaMon())) {
                return monHoc1;
            }
        }
        return null;
    }

    public void sapXepTinChiTang() {
        Collections.sort(al_MonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                if (o1.getTinChi() == o2.getTinChi()) {
                    return 0;
                } else if (o1.getTinChi() > o2.getTinChi()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public void sapXepTenMonHoc() {
        Collections.sort(al_MonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTenMon().compareTo(o2.getTenMon());
            }
        });
    }

    public void ghiFile(String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        for (MonHoc monHoc : al_MonHoc) {
            String str = monHoc.getMaMon() + ";" +monHoc.getTenMon();
            fw.write(str);
        }
        fw.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlmh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author yushu
 */
public class DSMonHoc {

    private ArrayList<MonHoc> dsmh;

    public DSMonHoc() {
        this.dsmh = new ArrayList<>();
    }

    public ArrayList<MonHoc> getDsmh() {
        return dsmh;
    }

    public void themMonHoc(MonHoc mh) {
        dsmh.add(mh);
    }

    public void xoaMonHoc(MonHoc mh) {
        for (MonHoc mhoc : dsmh) {
            if (mhoc.getMaMonHoc().equals(mh.getMaMonHoc())) {
                dsmh.remove(mhoc);
                break;
            }
        }
    }
    public void suaMonHoc(MonHoc mh) {
        for (MonHoc mhoc : dsmh) {
            if (mhoc.getMaMonHoc().equals(mh.getMaMonHoc())) {
                mhoc.setTenMonHoc(mh.getTenMonHoc());
                mhoc.setSoTinChi(mh.getSoTinChi());
            }
        }
    }
    public boolean timKiem(String maMH) {
        for (MonHoc mhoc : dsmh) {
            if (mhoc.getMaMonHoc().compareTo(maMH) == 0) {
                return true;
            }
        }
        return false;
    }
    public MonHoc timKiemMH(String maMH) {
        for (MonHoc mhoc : dsmh) {
            if (mhoc.getMaMonHoc().compareTo(maMH) == 0) {
                return mhoc;
            }
        }
        return null;
    }
    public void sapXep̣̣MaMH() {
        Collections.sort(dsmh, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
               return mh1.getMaMonHoc().compareTo(mh2.getMaMonHoc());
            }
        });
    }
    
     public void sapXep̣̣TenMH() {
        Collections.sort(dsmh, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                return mh1.getTenMonHoc().compareTo(mh2.getTenMonHoc());
            }
        });
    }
      public void sapXepSTC̣̣() {
        Collections.sort(dsmh, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                if (mh1.getSoTinChi() == mh2.getSoTinChi()) {
                    return 0;
                } else if (mh1.getSoTinChi() > mh2.getSoTinChi()) {
                    return 1;
                }
                return -1;
            }
        });
    }
    public String hienThiDS() {
        String s = "";
        for (MonHoc mhoc : dsmh) {
            s += mhoc.toString() + "\n";
        }
        return s;
    }
}

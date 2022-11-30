/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlmonhoc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dthan
 */
public class DSMonHoc {

    private ArrayList<MonHoc> al_MonHocs;

    public DSMonHoc() {
        al_MonHocs = new ArrayList<>();
    }

    public DSMonHoc(ArrayList<MonHoc> al_MonHocs) {
        this.al_MonHocs = al_MonHocs;
    }

    public ArrayList<MonHoc> getAl_MonHocs() {
        return al_MonHocs;
    }

    public void setAl_MonHocs(ArrayList<MonHoc> al_MonHocs) {
        this.al_MonHocs = al_MonHocs;
    }

//    Thêm môn học
    public void themDS(MonHoc mh) {
        al_MonHocs.add(mh);
    }

    // Xoá môn học
    public void xoaMonHoc(MonHoc mh) {
        for (MonHoc al_MonHoc : al_MonHocs) {
            if (al_MonHoc.getMaMon().equals(mh.getMaMon())) {
                al_MonHocs.remove(al_MonHoc);
            }
        }
    }

    public void suaMonHoc(MonHoc mh) {
        for (MonHoc al_MonHoc : al_MonHocs) {
            if (al_MonHoc.getMaMon().equals(mh.getMaMon())) {
                al_MonHoc.setTenMon(mh.getTenMon());
                al_MonHoc.setSoTinChi(mh.getSoTinChi());
            }
        }
    }

    public boolean timKiem(String maMH) {
        for (MonHoc al_MonHoc : al_MonHocs) {
            if (al_MonHoc.getMaMon().compareTo(maMH) == 0) {
                return true;
            }
        }
        return false;
    }

    public MonHoc timKiemMH(String maMH) {
        for (MonHoc al_MonHoc : al_MonHocs) {
            if (al_MonHoc.getMaMon().compareTo(maMH) == 0) {
                return al_MonHoc;
            }
        }
        return null;
    }

    public void sapXepTenMH() {
        Collections.sort(al_MonHocs, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                return mh1.getTenMon().compareTo(mh2.getTenMon());
            }
        });
    }

    public void sapXepMaMH() {
        Collections.sort(al_MonHocs, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                return mh1.getMaMon().compareTo(mh2.getMaMon());
            }
        });
    }

    public void sapXepSTC() {
        Collections.sort(al_MonHocs, new Comparator<MonHoc>() {
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
    public String hienThiDS()
    {
    String s = "";
        for (MonHoc al_MonHoc : al_MonHocs) {
            s+= al_MonHoc.toString() + "\n";
        }
        return s;
    }
}

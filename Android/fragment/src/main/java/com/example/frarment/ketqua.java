package com.example.frarment;

import java.io.Serializable;

public class ketqua implements Serializable {
String pt1,pt2,kq;

    public ketqua() {
    }

    public ketqua(String pt1, String pt2, String kq) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.kq = kq;
    }

    public String getPt1() {
        return pt1;
    }

    public void setPt1(String pt1) {
        this.pt1 = pt1;
    }

    public String getPt2() {
        return pt2;
    }

    public void setPt2(String pt2) {
        this.pt2 = pt2;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
}

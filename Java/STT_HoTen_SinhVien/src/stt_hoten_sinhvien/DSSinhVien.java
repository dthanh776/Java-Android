package stt_hoten_sinhvien;

import java.util.ArrayList;

/**
 *
 * @author Thanh
 */
public class DSSinhVien {

    private ArrayList<SinhVien> al_SinhVien;

    public DSSinhVien() {
        al_SinhVien = new ArrayList<>();
    }

    public void themDS(SinhVien sv) {
        al_SinhVien.add(sv);
    }

    public void xoaDS(String mssv) {
        for (SinhVien sinhVien : al_SinhVien) {
            if (sinhVien.getMa().equals(mssv)) {
                al_SinhVien.remove(sinhVien);
                break;
            }
        }
    }

    public void suaDS(SinhVien sv) {
        for (SinhVien sinhVien : al_SinhVien) {
            if (sinhVien.getMa().equals(sv.getMa())) {
                sinhVien.setHoTen(sv.getHoTen());
                sinhVien.setTuoi(sv.getTuoi());
            }
        }
    }

    public void hienThiDS() {
        for (SinhVien sinhVien : al_SinhVien) {
            System.out.println(sinhVien.toString());
        }
    }

    public SinhVien timSV(SinhVien sv) {
        SinhVien sinhVien = null;
        for (SinhVien sinhVien1 : al_SinhVien) {
            if (sinhVien1.getMa().equals(sv.getMa())) {
                sinhVien = sv;
            }
        }
        return sv;
    }

    public int timMaxTuoi() {
        int maxTuoi = Integer.MIN_VALUE;
        for (SinhVien sinhVien : al_SinhVien) {
            if (maxTuoi < sinhVien.getTuoi()) {
                maxTuoi = sinhVien.getTuoi();
            }
        }
        return maxTuoi;
    }

    public int timMinTuoi() {
        int minTuoi = Integer.MAX_VALUE;
        for (SinhVien sinhVien : al_SinhVien) {
            if (minTuoi > sinhVien.getTuoi()) {
                minTuoi = sinhVien.getTuoi();
            }
        }
        return minTuoi;
    }

    public int timTBTuoi() {
        int maxTuoi = Integer.MAX_VALUE;
        int total = 0;
        for (SinhVien sinhVien : al_SinhVien) {
            if (maxTuoi > sinhVien.getTuoi()) {
                total += sinhVien.getTuoi();
            }
        }
        return total / al_SinhVien.size();
    }

}

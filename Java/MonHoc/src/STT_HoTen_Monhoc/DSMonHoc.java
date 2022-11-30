package STT_HoTen_Monhoc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dthan
 */
public class DSMonHoc {

    public ArrayList<MonHoc> al_MonHoc;

    public ArrayList<MonHoc> getAl_MonHoc() {
        return al_MonHoc;
    }

    public void setAl_MonHoc(ArrayList<MonHoc> al_MonHoc) {
        this.al_MonHoc = al_MonHoc;
    }

    public DSMonHoc() {
        this.al_MonHoc = new ArrayList<>();
    }

    public void themDS(MonHoc mh) {
        al_MonHoc.add(mh);
    }

    public void xoaMonHoc(MonHoc mh) {
        for (MonHoc monHoc : al_MonHoc) {
            if (monHoc.getMaMonHoc().equals(mh.getMaMonHoc())) {
                al_MonHoc.remove(mh);
                break;
            }
        }
    }

    public void XuatDS() {
        for (MonHoc monHoc : al_MonHoc) {
            System.out.println(monHoc.toString());
        }
    }

    public boolean timKiemDS(MonHoc mh) {
        for (MonHoc monHoc : al_MonHoc) {
            if (monHoc.getMaMonHoc().equals(mh.getMaMonHoc())) {
                return true;
            }
        }
        return false;
    }

    // Sap xep tang 
    public void sapXepTangTC() {
        Collections.sort(al_MonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                if (mh1.getSoTinChi() == mh2.getSoTinChi()) {
                    return 0;
                } else if (mh1.getSoTinChi() > mh2.getSoTinChi()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public void sapXepTenMon() {
        Collections.sort(al_MonHoc, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc mh1, MonHoc mh2) {
                return mh1.getTenMon().compareTo(mh2.getTenMon());
            }
        });
    }
    
    
    
}

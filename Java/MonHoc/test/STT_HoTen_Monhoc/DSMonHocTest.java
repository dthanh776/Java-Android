/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STT_HoTen_Monhoc;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dthan
 */
public class DSMonHocTest {

    public DSMonHocTest() {
    }

    @Test
    public void testThemDS() {
        System.out.println("themDS");

        DSMonHoc instance = new DSMonHoc();
        MonHoc mh = new MonHoc("2", "Java2", 5);
        instance.themDS(new MonHoc("1", "Java", 5));
        instance.themDS(new MonHoc("2", "Java2", 5));
        instance.themDS(mh);
        assertEquals(mh.toString(), instance.getAl_MonHoc().get(1).toString());
    }

    @Test
    public void testXoaMon() {
        System.out.println("xoaMon");
        DSMonHoc instance = new DSMonHoc();
        MonHoc mh = new MonHoc("1", "Java", 5);
        instance.themDS(new MonHoc("1", "Java", 5));
        instance.themDS(new MonHoc("2", "Java2", 5));
        instance.xoaMonHoc(mh);
    }

    @Test
    public void sapXepTangTC() {
        DSMonHoc ds = new DSMonHoc();
        MonHoc mh1 = new MonHoc("1", "java", 5);
        MonHoc mh2 = new MonHoc("2", "c#", 4);
        MonHoc mh3 = new MonHoc("mh3", "php", 2);

        ds.themDS(mh1);
        ds.themDS(mh2);
        ds.themDS(mh3);
        ds.XuatDS();
        ds.sapXepTangTC();
        assertEquals(mh2, ds.getAl_MonHoc().get(0));
    }
    
    @Test
    public void sapXepTenMon() {
        DSMonHoc ds = new DSMonHoc();
        MonHoc mh1 = new MonHoc("1", "java", 5);
        MonHoc mh2 = new MonHoc("2", "c#", 4);
        MonHoc mh3 = new MonHoc("mh3", "php", 2);
        
        ds.themDS(mh1);
        ds.themDS(mh2);
        ds.themDS(mh3);
        ds.XuatDS();
        ds.sapXepTenMon();
        assertEquals(mh2, ds.getAl_MonHoc().get(0));
    }
    
    
}

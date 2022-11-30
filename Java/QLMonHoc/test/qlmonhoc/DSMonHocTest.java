/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlmonhoc;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dthan
 */
public class DSMonHocTest {

    @Test
    public void testThemMonHoc() {
        DSMonHoc instance = new DSMonHoc();

        MonHoc a = new MonHoc("a", "aa", 4);
        MonHoc b = new MonHoc("b", "bb", 4);
        MonHoc c = new MonHoc("c", "cc", 4);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);
        assertEquals(instance.getAl_MonHoc().get(2).toString(), c.toString());
    }

    @Test
    public void testXoaMonHoc() {
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 4);
        MonHoc b = new MonHoc("b", "bb", 4);
        MonHoc c = new MonHoc("c", "cc", 4);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);

        instance.xoaMonHoc(c);
        assertEquals(instance.getAl_MonHoc().size(), 2);
    }

    @Test
    public void testSuaMonHoc() {
        System.out.println("sua mon hoc");
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 4);
        MonHoc b = new MonHoc("b", "bb", 4);
        MonHoc c = new MonHoc("c", "cc", 4);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);

        instance.suaMonHoc(c);

        assertEquals(instance.getAl_MonHoc().get(2).getTenMon(), c.getTenMon());
    }

    @Test
    public void testHienThiMonHoc() {
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 4);
        MonHoc b = new MonHoc("b", "bb", 4);
        MonHoc c = new MonHoc("c", "cc", 4);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);

        String expect = a.toString() + "\n" + b.toString() + "\n" + c.toString() + "\n";
        assertEquals(instance.hienThiMonHoc(), expect);
        
    }

    @Test
    public void testTimMonHoc() {
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 4);
        MonHoc b = new MonHoc("b", "bb", 4);
        MonHoc c = new MonHoc("c", "cc", 4);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);       
        
        assertEquals(instance.timMonHoc(c).toString(),c.toString());
    }

    @Test
    public void testSapXepTang() {
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 2);
        MonHoc b = new MonHoc("b", "bb", 1);
        MonHoc c = new MonHoc("c", "cc", 3);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);

        instance.sapXepTinChiTang();
        assertEquals(instance.getAl_MonHoc().get(0).getTinChi(), 1);
        assertEquals(instance.getAl_MonHoc().get(1).getTinChi(), 2);
        assertEquals(instance.getAl_MonHoc().get(2).getTinChi(), 3);
    }

    @Test
    public void testGhiFile() throws IOException {
        DSMonHoc instance = new DSMonHoc();
        MonHoc a = new MonHoc("a", "aa", 2);
        MonHoc b = new MonHoc("b", "bb", 1);
        MonHoc c = new MonHoc("c", "cc", 3);
        instance.themMonHoc(a);
        instance.themMonHoc(b);
        instance.themMonHoc(c);

        instance.ghiFile("test.txt");
        assertEquals(instance.getAl_MonHoc().get(2).toString(), c.toString());
    }

}

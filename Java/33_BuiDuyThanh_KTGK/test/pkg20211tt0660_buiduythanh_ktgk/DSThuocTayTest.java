/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20211tt0660_buiduythanh_ktgk;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dthan
 */
public class DSThuocTayTest {

    public DSThuocTayTest() {
    }

    @Test
    public void testThemThuocTay() {
        ThuocTay a = new ThuocTay("a1", "dauhong", 2, 5000);
        ThuocTay b = new ThuocTay("a2", "daubung", 3, 6000);
        ThuocTay c = new ThuocTay("a3", "daurang", 4, 7000);
        DSThuocTay instance = new DSThuocTay();
        instance.themThuocTay(a);
        instance.themThuocTay(b);
        instance.themThuocTay(c);
        assertEquals(instance.getAl_ThuocTay().get(2).toString(), c.toString());
        assertEquals(instance.getAl_ThuocTay().size(), 3);
    }

    @Test
    public void testSuaThuocTay() {
        ThuocTay a = new ThuocTay("a1", "dauhong", 2, 5000);
        ThuocTay b = new ThuocTay("a2", "daubung", 3, 6000);
        ThuocTay c = new ThuocTay("a3", "daurang", 4, 7000);
        DSThuocTay instance = new DSThuocTay();
        instance.themThuocTay(a);
        instance.themThuocTay(b);
        instance.themThuocTay(c);

        ThuocTay expect = new ThuocTay("a3", "dauchan", 5, 8000);

        instance.suaThuocTay(expect);
        assertEquals(instance.getAl_ThuocTay().get(2).getMaThuoc(), expect.getMaThuoc());
        assertEquals(instance.getAl_ThuocTay().get(2).getDonGia(), expect.getDonGia());
        assertEquals(instance.getAl_ThuocTay().get(2).getDonViTinh(), expect.getDonViTinh());
    }

    @Test
    public void testXoaThuocTay() {
        ThuocTay a = new ThuocTay("a1", "dauhong", 2, 5000);
        ThuocTay b = new ThuocTay("a2", "daubung", 3, 6000);
        ThuocTay c = new ThuocTay("a3", "daurang", 4, 7000);
        DSThuocTay instance = new DSThuocTay();
        instance.themThuocTay(a);
        instance.themThuocTay(b);
        instance.themThuocTay(c);

        instance.xoaThuocTay("a1");
        assertEquals(instance.getAl_ThuocTay().size(), 2);
        assertEquals(instance.getAl_ThuocTay().get(0).getMaThuoc(), b.getMaThuoc());
    }

    @Test
    public void testHienThiThuocTay() {
        ThuocTay a = new ThuocTay("a1", "dauhong", 2, 5000);
        ThuocTay b = new ThuocTay("a2", "daubung", 3, 6000);
        ThuocTay c = new ThuocTay("a3", "daurang", 4, 7000);
        DSThuocTay instance = new DSThuocTay();
        instance.themThuocTay(a);
        instance.themThuocTay(b);
        instance.themThuocTay(c);

        String expect = a.toString() + "\n" + b.toString() + "\n" + c.toString() + "\n";
        assertEquals(instance.hienThiThuocTay(), expect);
    }

    @Test
    public void testTimThuocTay() {
        ThuocTay a = new ThuocTay("a1", "dauhong", 2, 5000);
        ThuocTay b = new ThuocTay("a2", "daubung", 3, 6000);
        ThuocTay c = new ThuocTay("a3", "daurang", 4, 7000);
        DSThuocTay instance = new DSThuocTay();
        instance.themThuocTay(a);
        instance.themThuocTay(b);
        instance.themThuocTay(c);

        ThuocTay tt = instance.timThuocTay(7000);
        assertEquals(tt, c);
    }

}

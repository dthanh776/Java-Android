/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt_hoten_khoa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dthan
 */
public class DSKhoaTest {
    
    public DSKhoaTest() {
    }

    @Test
    public void testThemDSKhoa() {
        System.out.println("ThemDSKhoa");
        Khoa kh = new Khoa ("cntt","Cong nghe thong tin");
        DSKhoa instance = new DSKhoa();
        instance.ThemDSKhoa(kh);      
    }

    @Test
    public void testXoaDSKhoa() {
        System.out.println("XoaDSKhoa");
        String maKhoa = "";
        DSKhoa instance = new DSKhoa();
        instance.XoaDSKhoa(maKhoa);
        fail("The test case is a prototype.");
    }

    @Test
    public void testXuatDSKhoa() {
        System.out.println("XuatDSKhoa");
        DSKhoa instance = new DSKhoa();
        instance.XuatDSKhoa();
    }

    @Test
    public void testSuaKhoa() {
        System.out.println("suaKhoa");
        Khoa kh = null;
        DSKhoa instance = new DSKhoa();
        instance.suaKhoa(kh);
    }
    
}

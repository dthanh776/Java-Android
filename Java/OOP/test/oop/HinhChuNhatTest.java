/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dthan
 */
public class HinhChuNhatTest {
    
    public HinhChuNhatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getChieuDai method, of class HinhChuNhat.
     */
    @Test
    public void testGetChieuDai() {
        System.out.println("getChieuDai");
        HinhChuNhat instance = new HinhChuNhat();
        int expResult = 0;
        int result = instance.getChieuDai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChieuDai method, of class HinhChuNhat.
     */
    @Test
    public void testSetChieuDai() {
        System.out.println("setChieuDai");
        int chieuDai = 0;
        HinhChuNhat instance = new HinhChuNhat();
        instance.setChieuDai(chieuDai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChieuRong method, of class HinhChuNhat.
     */
    @Test
    public void testGetChieuRong() {
        System.out.println("getChieuRong");
        HinhChuNhat instance = new HinhChuNhat();
        int expResult = 0;
        int result = instance.getChieuRong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChieuRong method, of class HinhChuNhat.
     */
    @Test
    public void testSetChieuRong() {
        System.out.println("setChieuRong");
        int chieuRong = 0;
        HinhChuNhat instance = new HinhChuNhat();
        instance.setChieuRong(chieuRong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HinhChuNhat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HinhChuNhat instance = new HinhChuNhat();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tinhDienTich method, of class HinhChuNhat.
     */
    @Test
    public void testTinhDienTich() {
        System.out.println("tinhDienTich");
        HinhChuNhat instance = new HinhChuNhat();
        int expResult = 0;
        int result = instance.tinhDienTich();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tinhChuVi method, of class HinhChuNhat.
     */
    @Test
    public void testTinhChuVi() {
        System.out.println("tinhChuVi");
        HinhChuNhat instance = new HinhChuNhat();
        int expResult = 0;
        int result = instance.tinhChuVi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

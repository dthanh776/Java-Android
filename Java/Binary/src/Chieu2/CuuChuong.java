/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chieu2;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class CuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        do {
        System.out.println("Nhap k");
        k = input.nextInt();
        } while (k <= 2 || k >= 9);
        for (int i = 1; i <= 10; i++) {
            System.out.println(k + " x " + i + " = " + k*i);
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("**********");
        }
    }
    
}

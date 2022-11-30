/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class BangCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        do {
            System.out.println("Nhap k");
            k = input.nextInt();
        } while (k < 2 || k > 9);
        for (int i = 1; i < 11; i++) {
            System.out.println(k + "X" + i + "=" + k*i);
        }
        
    }
    
}

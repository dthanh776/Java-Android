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
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ban Binary");
        for (int i = 1; i <= 256; i++) {
            System.out.println(i + " = " + Integer.toBinaryString(i));
        }
        System.out.println("Ban Octal");
        for (int i = 1; i <= 256; i++) {
            System.out.println(i + " = " + Integer.toOctalString(i));
        }
        System.out.println("Ban Hexa");
        for (int i = 1; i <= 256; i++) {
            System.out.println(i + " = " + Integer.toHexString(i));
        }
    }
    
}

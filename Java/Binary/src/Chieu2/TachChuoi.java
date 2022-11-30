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
public class TachChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "Cao Dang   Cong Nghe Thu Duc";
        
        while (s.indexOf("  ") != -1)
        {
            s = s.replace("  "," ");
        }
         String[] s2 = s.trim().split(" ");       
        String result ="";
        for (String word : s2){           
            result += word.charAt(0);
        }
        System.out.println(result.toUpperCase());
    }
    
}

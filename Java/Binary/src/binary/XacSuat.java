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
public class XacSuat {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so lan tung: ");
        int n = input.nextInt();
        int[] arr = new int[6];
        for (int i = 1; i <= n; i++) {
            int randomNumber = (int)(Math.random() * 6 + 1) ;
            arr[randomNumber - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("So lan xuat hien cua mat " + (i+1) + " : "+arr[i]);
        }
        input.close();
    }
    
}

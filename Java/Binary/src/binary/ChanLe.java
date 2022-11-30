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
public class ChanLe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = input.nextInt();
        int sum = 0;
        if (n % 2== 0) {
            System.out.println("Tong cac so chan la");
            for (int i = 2; i <=n; i = i + 2) {
                if (i % 2 == 0) {
                    sum+= i;
                    System.out.print(i);
                    if (i < n) {
                        System.out.print(" + ");
                    }
                }
            }
            System.out.println(" = " + sum);
        }
        else {
            System.out.println("Tong cac so le la");
            for (int i = 1; i <= n; i = i + 2) {
                if (n % 2 == 1) {
                    sum+= i;
                    System.out.print(i);
                    if (i < n) {
                        System.out.print(" + ");
                    }
                }
            }
            System.out.print(" = " + sum);
        }
    
        }
    }
    


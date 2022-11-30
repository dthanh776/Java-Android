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
public class NhapXuatMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");

        int n = input.nextInt();
        int arr[] = new int[n];
        NhapMang(arr);
        XuatMang(arr);
        XuatSNT(arr);
        DemSCP(arr);
    }

    static void NhapMang(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            arr[i] = input.nextInt();
        }
        input.close();
    }

    static void XuatMang(int[] arr) {
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    static boolean KTSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void XuatSNT(int[] arr) {
        System.out.println("Cac so nguyen to la");
        for (int i : arr) {
            if (KTSNT(i)) {
                System.out.println(i + "\t");
            }
        }
    }

    static void XuatMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max" + max);
    }
    static boolean KTSNP(double n) {
        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq)) == 0);
    }
    static void DemSCP (int[] arr){
    int temp = 0;
        System.out.println("Tong so chinh phuong: ");
        for (int i = 0; i < arr.length; i++) {
            if (KTSNP((int)arr[i]) == true) {
                temp++;
            }
        }
        System.out.println(temp);
    }
    static void SapXepGiam (int[] arr)
    {
    int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

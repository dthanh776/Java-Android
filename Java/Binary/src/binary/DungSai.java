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
public class DungSai {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kqDung = {"Very good!"," Excellent!","Nice work!","Keep up the good work"};
        String[] kqSai = {"No. Please try again."," Wrong. Try once more.","Don't give up!","Wrong. Keep trying."};
        int a, b, kq;
        int sum = 0;
        boolean check = false;
        do {
            System.out.print("a: ");
            a = (int)(Math.random() * 10 + 1) ;
            System.out.print(a+"\n");
            System.out.print("b: ");
            b = (int)(Math.random() * 10 + 1) ;
            System.out.print(b+"\n");
            sum = a + b;
            System.out.print("Enter result: ");
            kq = input.nextInt();
            int random = (int)(Math.random() * 4) ;
            if (kq == sum) {
                check = true;
               System.out.println(kqDung[random]);
            } else {
                System.out.println(kqSai[random]);
            }
        } while (check == false);
        input.close();
    }
    
}

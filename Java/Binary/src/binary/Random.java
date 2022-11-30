
package binary;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n, m;
        System.out.println("Random integer number between N and M: ");
        do {
            System.out.print("Enter N: ");
            n = input.nextInt();
            System.out.print("Enter M: ");
            m = input.nextInt();
        } while (m - n < 2);
        
        int randomNumber = (int)(Math.random() * (m - n - 1) + n) + 1 ;
        System.out.println("Random number from N to M: " + randomNumber);
        input.close();
    }
    
}

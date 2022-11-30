
package binary;

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
        
        String str = "Cao Dang Cong Nghe Thu Duc";
        String[] arrS = str.split(" ");
        
        for (String item : arrS)
        {
            if (item.trim().length()>1)
            System.out.print(item.charAt(0));
        }
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class WeightHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bui Duy Thanh");
        
        System.out.println("Enter your weight");
        float weight = input.nextFloat();
         
        System.out.println("Enter your height");
        float height = input.nextFloat();
        
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        
        }           
    }

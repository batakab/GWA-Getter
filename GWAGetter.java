package MyApp.src.JavaFundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GWAGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 1st Final Grade: ");
        float a = sc.nextFloat();
        System.out.print("Enter your 2nd Final Grade: ");
        float b = sc.nextFloat();
        System.out.print("Enter your 3rd Final Grade: ");
        float c = sc.nextFloat();
        System.out.print("Enter your 4th Final Grade: ");
        float d = sc.nextFloat();
        System.out.print("Enter your 5th Final Grade: ");
        float e = sc.nextFloat();
        System.out.print("Enter your 6th Final Grade: ");
        float f = sc.nextFloat();
        System.out.println();


        float gwa = (a + b + c + d + e + f) / 6;
        DecimalFormat numberFormat = new DecimalFormat("#.00");



        if(gwa >= 3.25 && gwa <= 3.49){
            System.out.println("GWA: " + numberFormat.format(gwa));
            System.out.println("Congrats! You're on the Dean's Second Honors List");
        } else if (gwa >= 3.5) {
            System.out.println("GWA: " + numberFormat.format(gwa));
            System.out.println("Congrats! You're on the Dean's First Honors List");
        }else{
            System.out.println("GWA: " + numberFormat.format(gwa));
        }





    }
}

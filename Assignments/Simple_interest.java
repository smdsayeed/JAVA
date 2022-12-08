import java.util.Scanner;

/*  Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.*/


public class Simple_interest {
   
    public static void main(String[] args) {
        System.out.println("Enter the principal (investing money)");
        try (Scanner input = new Scanner(System.in)) {
            int p = input.nextInt();

            System.out.println("Enter the rate of Interest ");
            int r = input.nextInt();
            

            System.out.println("Enter the time period in Years");
            int y = input.nextInt();

            float i = (p*r*y)/100;
            float amount = p + i;

      
            System.out.println("interest rate is :" + i);
            System.out.println("Amount is :" + amount);
        }


    }
    
}

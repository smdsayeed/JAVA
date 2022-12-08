// Input currency in rupees and output in USD.
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
       System.out.println("Enter the amount in Rupees");
        Scanner input = new Scanner(System.in);
            int r = input.nextInt();
// for more precision change datat types into double
            int us = r / 82; //important 
            System.out.println("$US Dollars :" + us);

    }
}

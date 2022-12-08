import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

// Take 2 numbers as input and print the largest number.
public class Largest_Number {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();


        System.out.println("Enter a Number");
        int n2 = input.nextInt();

        if (n1>n2) {
            System.out.println("The Greater value between the two numbers is :" + n1);
        } else {
            System.out.println("The Greater value between the two numbers is :" + n2);
            
        }
    }
}

import java.util.Scanner;

// write a program to check whether a number is even or odd
public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

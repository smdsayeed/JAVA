import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take
public class Even_Odd{
    public static void main(String[] args) {
        System.out.println("Enter a number to validate if its is Even or odd");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n%2==0){
            System.out.println("Even Number");
        }
        else
        System.out.println("Odd Number");
    }
}
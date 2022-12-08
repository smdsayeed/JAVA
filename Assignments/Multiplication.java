import java.util.Scanner;
// Take a number as input and print the multiplication table for it.
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
     for (int i = 1; i <=10; i++) {
        System.out.println(n1 + " * " + i + " = " + n1*i);}
     }
}

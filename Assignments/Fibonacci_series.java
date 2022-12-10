import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci_series {
    public static void main(String[] args) {
        int a = 0,b= 1,temp;
        System.out.println("Enter a limit to print the Fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            temp = a+b;
            a= b;
            b=temp;
            System.out.println(b);
        }
        System.out.print("The number at the limit provided " + b);
    }
}
import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci_series {
    public static void main(String[] args) {
        int a = 0,b= 1,temp;
        System.out.println("Enter a limit to print the Fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            temp = a+b;
            a= b;
            b=temp;
            System.out.println(b);
        }
        System.out.print("The number at the limit provided " + b);
    }
}

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.
public class Greetings{
    public static void main(String[] args) {
        System.out.println("Enter Your Name, Master !");
        Scanner in = new Scanner(System.in);
        String n = in.next();

        System.out.println(" Greetings Master " + n);
    }
}


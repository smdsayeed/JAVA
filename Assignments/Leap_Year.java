import java.util.Scanner;

// Input a year and find whether it is a leap year or not.
public class Leap_Year{
    public static void main(String[] args) {
        System.out.println("Enter a Year");


        Scanner in = new Scanner(System.in);
        int y = in.nextInt();

        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
            System.out.println("LEAP YEAR!");
        } else {
            System.out.println("NOT A LEAP YEAR ");
        }
    }
}
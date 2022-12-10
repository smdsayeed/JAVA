
import java.util.Scanner;

// To find Armstrong Number to a  given number.

public class Armstrong {
    private static final boolean temp = false;
    private static final int temp1 = 0;

    public static void main(String[] args) {
        //taking a number as an input to check if it is armstrong or not
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
     
            int temp, a,b=0;
            temp =n1;
            while (n1>0) {
                a=n1%10;
                n1 = n1/10;
                b = b+(a*a*a);
            }
            if (temp==b) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not armstrong number");
            }
      

    }
}

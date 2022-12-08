import java.util.Scanner;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumOfAll {
    public static void main(String[] args) {
       
     System.out.println("Enter a value ");
     System.out.print("If enter 0 program ends and you get your sum;");
     System.out.println("");
     int number;
     int sum=0;

     do {
        Scanner input = new Scanner(System.in);
        number = input.nextInt() ;
        // Scan.close();
        sum += number;

     } while (number!=0);
     System.out.println("Sum is : " + sum);
}
}
<<<<<<< HEAD
import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        System.out.println("Enter a number");
        int n2 = in.nextInt();


        System.out.println("Enter an operator like +,-,*,/");
        char op = in.next().trim().charAt(0); //!important
        //.trim is used to trim the space and charAt is used to check the charcter at the indexing position
        int ans = 0;
        if(op == '+' || op == '-' || op == '*' || op == '/'){
           if(op =='+'){
            ans = n1 + n2;
            System.out.println("The sum is: " + ans);
           }
           if(op =='-'){
            ans = n1 - n2;
            System.out.println("The Subtraction is: " + ans);
           }
           
           if(op =='*'){
            ans = n1 * n2;
            System.out.println("The Multiplication of both is: " + ans);
           }
           
           if(op =='/'){
            ans = n1 / n2;
            System.out.println("The Remainder is: " + ans);
           }else if(op == 'x' || op == 'X'){
            System.out.println("invalid operator");
           }
        }else{
            System.out.println("Invalid Operation");
        }





    }
}
=======
import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        System.out.println("Enter a number");
        int n2 = in.nextInt();


        System.out.println("Enter an operator like +,-,*,/");
        char op = in.next().trim().charAt(0); //!important
        //.trim is used to trim the space and charAt is used to check the charcter at the indexing position
        int ans = 0;
        if(op == '+' || op == '-' || op == '*' || op == '/'){
           if(op =='+'){
            ans = n1 + n2;
            System.out.println("The sum is: " + ans);
           }
           if(op =='-'){
            ans = n1 - n2;
            System.out.println("The Subtraction is: " + ans);
           }
           
           if(op =='*'){
            ans = n1 * n2;
            System.out.println("The Multiplication of both is: " + ans);
           }
           
           if(op =='/'){
            ans = n1 / n2;
            System.out.println("The Remainder is: " + ans);
           }else if(op == 'x' || op == 'X'){
            System.out.println("invalid operator");
           }
        }else{
            System.out.println("Invalid Operation");
        }





    }
}
>>>>>>> a08b7d6735e224c6055d32ae10125b89d7a40e27

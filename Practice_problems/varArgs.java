import java.util.Arrays;
import java.util.Scanner;

public class varArgs {
    public static void main(String[] args) {
        // System.out.println("Enter a name");
        // Scanner in = new Scanner(System.in);

    //   fun();
      mulitple(1,2,"sayeed","kasheef");
      /* note: the varaible length arguments should be 
       * added to the end and not in the middle it will 
       * through the error
       */
    }

    // static void fun(String ...a) {
    //     System.out.println(Arrays.toString(a));
        
    // }
    static void mulitple(int a, int b, String ...v){
        System.out.println(a+ " and " + b  +  Arrays.toString(v));
    }
}

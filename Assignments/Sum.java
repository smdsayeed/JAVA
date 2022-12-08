import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
    System.out.println("Enter a vlaue");
    try (Scanner in = new Scanner(System.in)) {
      int n1 = in.nextInt();
       System.out.println("Enter a vlaue");
       int n2 = in.nextInt();
       int sum = n1 + n2;
       System.out.println(sum);
   }
   } 
}

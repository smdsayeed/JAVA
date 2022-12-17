import java.util.Scanner;

//What is method ?
/*
Method is a block of code which only runs when it is called.
you can pass data knwon as parameters into the method .
Methods are used to perform certian actions and they are also known as Function.
*/
public class Methods{
    public static void main(String[] args) {
        
        int ans=sum();
        System.out.println("The sum is :" +  ans);

        //passing parameters to the methods/functions
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String name = input.next();
        String message= myGreet(name);
        System.out.println(message);
    }


    static String myGreet(String name) {
        String message = "Hello " + name;
        return message ;
    }


    //Static keyword is a must
    /*Cannot make a static reference to  the non static method */
     static int sum (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1 = input.nextInt();
        System.out.println("Enter the number ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        return sum;//anystatment cannot be reached to execute after the return statement
        // System.out.println("This will never execute");
    }
}
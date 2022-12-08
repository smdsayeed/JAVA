import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class Greetings {
    public static void main(String[] args) {
        
        // Taking name as an input 
        System.out.println("Please Enter the name");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        switch(name){
            case "Smd.Sayeed"->System.out.println(" Greetings " + name + "!");
            case "Smd.Kasheef"->System.out.println(" Greetings " + name + "!");
            default->System.out.println("You are not Authorized");
        }
    }
}

package Java_Practice_Programs;

import java.util.Scanner;


public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("Enter the fruit name");
       
        Scanner in = new  Scanner(System.in);
        String fruit = in.next();

        // Switch case advanced version
        switch (fruit) {
           
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("shines like a sun");
            case "grapes" -> System.out.println("fruit with so many balls");
            default -> System.out.println("Enter a valid fruit");
        }
        
        // better way to write
        System.out.println("Enter a number btw 1-7 to check if it is a weekend");
        Scanner inp = new  Scanner(System.in);
        int days = inp.nextInt();
        switch( days){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7->System.out.println("Weekend");
        }


            // nested switch
            System.out.println("Enter the employee id");
            Scanner input= new Scanner(System.in);
            int empid = input.nextInt();

            System.out.println("Enter the department");
            Scanner inpt= new  Scanner(System.in);
            String department = inpt.next();

            switch (empid){
                case 1 -> System.out.println("emp id is 1");
                case 2 -> System.out.println("emp id is 2");
                case 3 ->{
                        System.out.println("emp number 3");
                        switch (department) {
                           case "it"->System.out.println("IT Deparment");
                           case "management"-> System.out.println("Management Department");
                           default -> System.out.println("No department entered");
                        } 
                    }
            default -> System.out.println("Enter correct employee id");
        
    }
}}

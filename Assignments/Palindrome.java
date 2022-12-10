import java.util.Scanner;

// To find out whether the given String is Palindrome or not.


public class Palindrome {
    static boolean isPalindrome(String str){
        //pointers pointing to the begining and the end of the string
        int i =0,j= str.length()-1;

        while (i < j) {
            //If there is a mismatch
            if(str.charAt(i)!= str.charAt(j))
            return false;

            //increment the first operator
            //decrement the other
            i++;
            j--;
        }

        //given the string is
        return true;
    }
    public static void main(String[] args) {
        
        // string input
        String str= "hello";

        // conver the string into lowercase
        str = str.toLowerCase();
        //passing boolean function till holding true

        if (isPalindrome(str)) {
            System.out.println(" yes");
        } else {
            System.out.println("NO");
        }
       

    }
}

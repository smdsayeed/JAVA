import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Currency{
    private static float rupees;

    public static void main(String[] args) {
        System.out.println("Enter Amount in Rupees");
        Scanner in = new Scanner(System.in);
        rupees = in.nextFloat();

        double dollars = rupees/82.34;
        System.out.println("Amount in USD :" + dollars);
    }
}
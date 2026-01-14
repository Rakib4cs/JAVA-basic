package Amount;

import java.util.Scanner;

public class Monthly {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int phonePrice = 74000;
        int emi, month;

        System.out.print("Enter month: ");
        month = input.nextInt();

        emi = phonePrice / month;

        System.out.println("Monthly EMI: " + emi);
    }
}

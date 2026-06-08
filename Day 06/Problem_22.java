// Write a program to Convert binary to decimal.

import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking binary number as input
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int place = 1;

        // Process each digit of the binary number
        while (binary > 0) {

            // Get the last digit
            int digit = binary % 10;

            // Add its value to decimal
            decimal = decimal + (digit * place);

            // Move to next power of 2
            place = place * 2;

            // Remove the last digit
            binary = binary / 10;
        }

        // Print decimal number
        System.out.println("Decimal number = " + decimal);

        sc.close();
    }
}
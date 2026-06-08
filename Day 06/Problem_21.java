// Write a program to Convert decimal to binary.

import java.util.Scanner;

public class Problem_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking decimal number as input
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        // Variable to store binary number
        int binary = 0;
        int place = 1;

        while (num > 0) {

            // Get remainder 
            int remainder = num % 2;

            // Add remainder 
            binary = binary + (remainder * place);

            place = place * 10;

            num = num / 2;
        }

        // Print the binary number
        System.out.println("Binary number = " + binary);

        sc.close();
    }
}
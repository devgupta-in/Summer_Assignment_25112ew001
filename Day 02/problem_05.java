//Write a program to Find sum of digits of a number.

import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

       int sum=0;

        while(n>0) {
            int digit = n % 10; // Get the last digit
            sum = sum + digit; // Add the digit to the sum
            n = n / 10; // Remove the last digit
        }
        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}
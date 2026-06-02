//Write a program to Reverse a number.

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int reversed = 0;
        while(n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}

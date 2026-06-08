// Write a program to Recursive sum of digits.

import java.util.Scanner;

public class Problem_27 {

    // Function to find sum of digits
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sumDigits(n));

        sc.close();
    }
}
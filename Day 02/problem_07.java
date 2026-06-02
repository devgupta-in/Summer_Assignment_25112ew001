//Write a program to Find product of digits.

import java.util.Scanner;

public class problem_07 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int product = 1;
        while(n != 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}
// Write a program to Find x^n without pow().

import java.util.Scanner;

public class Problem_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter base: ");
        int x = sc.nextInt();

        System.out.print("Enter exponent: ");
        int n = sc.nextInt();

        int result = 1;

        // Calculate x^n
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println("Answer = " + result);

        sc.close();
    }
}
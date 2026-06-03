//Write a program to Check whether a number is prime.

import java.util.Scanner;

public class Problem_09 {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        int Prime = 1;

        if (n <= 1) {
            Prime = 0;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    Prime = 0;
                    break;
                }
            }
        }

        if (Prime == 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
         
    }
}
// Write a program to Count set bits in a number.

import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        // Count set bits
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}
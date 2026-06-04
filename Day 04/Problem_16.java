//Write a program to Print Armstrong numbers in a range.

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
//Write a program to Write function for perfect number.

import java.util.Scanner;

public class Problem_48 {

    // Function to check Perfect Number
    static boolean isPerfect(int num) {
        int sum = 0;

        // Find all proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}

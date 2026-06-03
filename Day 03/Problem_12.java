//Write a program to Find LCM of two numbers.

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num = Math.max(a, b);

        while (true) {
            if (num % a == 0 && num % b == 0) {
                System.out.println("LCM = " + num);
                break;
            }
            num++;
        }

        sc.close();
    }
}

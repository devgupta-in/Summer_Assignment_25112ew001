//Write a program to Check Armstrong number

import java.util.Scanner;

public class Problem_15{
    public static void main(String[] args) {
        Scanner n =  new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = n.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
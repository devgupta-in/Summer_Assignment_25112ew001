// Write a program to Write function to find sum of two numbers.

import java.util.Scanner;

public class Problem_41 {
    static void sumOf(int x,int y){
        int sum = x + y;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("The sum of two number is:");

        sumOf(a,b);

        sc.close();
    }
}

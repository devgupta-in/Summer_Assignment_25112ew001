// Write a program to Find nth Fibonacci term.

import java.util.Scanner;   

public class Problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci term to find: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.print(first + " ");
        sc.close();
    }
}

//Write a program to Print prime numbers in a range.


import java.util.Scanner;

public class Problem_10 {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        System.out.println("Prime numbers between 1 and " + n + " are:");
            for (int i = 2; i <= n; i++) {
                int Prime = 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        Prime = 0;
                        break;
                    }
                }
                if (Prime == 1) {
                    System.out.print(i + " ");
                }
            }
        sc.close();
    }
}
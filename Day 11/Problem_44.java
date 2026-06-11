// Write a program to Write function to find factorial.

import java.util.Scanner;

public class Problem_44 {
    static int factorial(int x){
        int f = 1;
        for(int i = 1; i <= x; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int fact = factorial(a);
        System.out.println("Factorial of given number is:" + fact);
    
        sc.close();
    }
}

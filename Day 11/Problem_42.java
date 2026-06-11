// Write a program to Write function to find maximum.

import java.util.Scanner;

public class Problem_42 {
    static int findMax(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int max = findMax(a, b);
        System.out.print("The maximum number:" + max);

        sc.close();
    }
}

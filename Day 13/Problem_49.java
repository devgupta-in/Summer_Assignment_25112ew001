//Write a program to Input and display array.

import java.util.Scanner;

public class Problem_49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value for index " + i + ": " );
            arr[i] = sc.nextInt();
        }

        System.out.println("The given Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
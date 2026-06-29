//Write a program to Create menu-driven array operations system. 

import java.util.Scanner;

public class Problem_114 {

    // Display array
    static void display(int arr[], int n) {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Find maximum
    static void maximum(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum = " + max);
    }

    // Find minimum
    static void minimum(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < min)
                min = arr[i];
        }   
        System.out.println("Minimum = " + min);
    }

    // Find sum
    static void sum(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++){
            total += arr[i];
        }
        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {
            System.out.println("\n===== Array Menu =====");
            System.out.println("1. Display");
            System.out.println("2. Maximum");
            System.out.println("3. Minimum");
            System.out.println("4. Sum");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    display(arr, n);
                    break;
                case 2:
                    maximum(arr, n);
                    break;
                case 3:
                    minimum(arr, n);
                    break;
                case 4:
                    sum(arr, n);
                    break;
            }

        } while (choice != 5);

        System.out.println("Program Ended.");
        sc.close();
    }
}
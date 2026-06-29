//Write a program to Create menu-driven string operations system.

import java.util.Scanner;

public class Problem_115 {

    // Length
    static void length(String str) {
        System.out.println("Length = " + str.length());
    }

    // Uppercase
    static void upper(String str) {
        System.out.println("Uppercase = " + str.toUpperCase());
    }

    // Lowercase
    static void lower(String str) {
        System.out.println("Lowercase = " + str.toLowerCase());
    }

    // Reverse
    static void reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== String Menu =====");
            System.out.println("1. Length");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    length(str);
                    break;
                case 2:
                    upper(str);
                    break;
                case 3:
                    lower(str);
                    break;
                case 4:
                    reverse(str);
                    break;
            }

        } while (choice != 5);

        System.out.println("Program Ended.");
        sc.close();
    }
}
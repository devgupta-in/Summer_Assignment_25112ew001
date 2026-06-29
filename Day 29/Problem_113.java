//Write a program to Create menu-driven calculator.

import java.util.Scanner;

public class Problem_113 {

    // Addition
    static void add(double a, double b) {
        System.out.println("Result = " + (a + b));
    }

    // Subtraction
    static void subtract(double a, double b) {
        System.out.println("Result = " + (a - b));
    }

    // Multiplication
    static void multiply(double a, double b) {
        System.out.println("Result = " + (a * b));
    }

    // Division
    static void divide(double a, double b) {
        if (b == 0)
            System.out.println("Division by zero is not possible.");
        else
            System.out.println("Result = " + (a / b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;

        do {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                a = sc.nextDouble();

                System.out.print("Enter second number: ");
                b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        add(a, b);
                        break;
                    case 2:
                        subtract(a, b);
                        break;
                    case 3:
                        multiply(a, b);
                        break;
                    case 4:
                        divide(a, b);
                        break;
                }
            }

        } while (choice != 5);

        System.out.println("Calculator Closed.");
        sc.close();
    }
}
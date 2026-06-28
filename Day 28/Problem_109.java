// Q109 Write a program to Create library management system.

import java.util.Scanner;

class Problem_109 {

    static String bookName = "New world to explore";
    static boolean isIssued = false;

    static void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    static void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    static void displayBook() {
        System.out.println("Book Name : " + bookName);
        if (isIssued)
            System.out.println("Status : Issued");
        else
            System.out.println("Status : Available");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Display Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
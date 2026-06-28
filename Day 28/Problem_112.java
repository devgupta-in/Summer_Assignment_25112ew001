// Q112 Write a program to Create contact management system.

import java.util.Scanner;

class Problem_112 {

    static String contactName = "";
    static String phoneNumber = "";

    static void addContact(String name, String number) {
        contactName = name;
        phoneNumber = number;
        System.out.println("Contact Added Successfully.");
    }

    static void viewContact() {
        if (contactName.equals("")) {
            System.out.println("No Contact Found.");
        } else {
            System.out.println("Name : " + contactName);
            System.out.println("Phone : " + phoneNumber);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- Contact Management System -----");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String number = sc.nextLine();

                    addContact(name, number);
                    break;

                case 2:
                    viewContact();
                    break;

                case 3:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
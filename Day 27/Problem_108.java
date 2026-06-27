// Write a program to Create marksheet generation system.

import java.util.Scanner;

public class Problem_108 {

    static String[] name = new String[100];
    static int[] roll = new int[100];
    static double[] total = new double[100];
    static double[] percentage = new double[100];
    static String[] grade = new String[100];

    static int count = 0;

    // Add Student
    static void addStudent(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Marks of Subject " + i + ": ");
            sum += sc.nextDouble();
        }

        total[count] = sum;
        percentage[count] = sum / 5;

        if (percentage[count] >= 90)
            grade[count] = "A+";
        else if (percentage[count] >= 80)
            grade[count] = "A";
        else if (percentage[count] >= 70)
            grade[count] = "B";
        else if (percentage[count] >= 60)
            grade[count] = "C";
        else if (percentage[count] >= 50)
            grade[count] = "D";
        else
            grade[count] = "Fail";

        count++;

        System.out.println("Marksheet Generated Successfully!");
    }

    // View Marksheet
    static void viewMarksheet() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("----------------------------");
            System.out.println("Roll Number : " + roll[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Total Marks : " + total[i]);
            System.out.println("Percentage  : " + percentage[i] + "%");
            System.out.println("Grade       : " + grade[i]);
        }
    }

    // Search Student
    static void searchStudent(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (roll[i] == r) {

                System.out.println("Student Found!");
                System.out.println("Name        : " + name[i]);
                System.out.println("Total Marks : " + total[i]);
                System.out.println("Percentage  : " + percentage[i] + "%");
                System.out.println("Grade       : " + grade[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== MARKSHEET GENERATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Marksheet");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewMarksheet();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
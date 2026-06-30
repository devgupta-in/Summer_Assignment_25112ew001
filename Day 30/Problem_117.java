//Write a program to Create student record system using arrays and strings.

import java.util.Scanner;

class Problem_117 {
    static String[] name = new String[100];
    static int[] roll = new int[100];
    static int[] marks = new int[100];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Added Successfully.");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nStudent Records");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll: " + roll[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
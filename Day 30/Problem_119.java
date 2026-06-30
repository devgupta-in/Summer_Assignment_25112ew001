// Write a program to Create mini employee management system.

import java.util.Scanner;

class Problem_119 {
    static int[] id = new int[100];
    static String[] name = new String[100];
    static double[] salary = new double[100];
    static int count = 0;

    static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;
        System.out.println("Employee Added.");
    }

    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No Employees.");
            return;
        }

        System.out.println("\nEmployee Details");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + id[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Salary: " + salary[i]);
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees");
            System.out.println("3.Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
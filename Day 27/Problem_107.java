//Write a program to Create salary management system.

import java.util.Scanner;

public class Problem_107 {

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static double[] basicSalary = new double[100];
    static double[] totalSalary = new double[100];

    static int count = 0;

    // Add Employee
    static void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary[count] = sc.nextDouble();

        // Salary Calculation
        double hra = basicSalary[count] * 0.20;
        double da = basicSalary[count] * 0.10;

        totalSalary[count] = basicSalary[count] + hra + da;

        count++;

        System.out.println("Employee Added Successfully!");
    }

    // View Salary Records
    static void viewSalary() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\n===== Salary Records =====");

        for (int i = 0; i < count; i++) {

            System.out.println("----------------------------");
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + empName[i]);
            System.out.println("Basic Salary  : " + basicSalary[i]);
            System.out.println("Total Salary  : " + totalSalary[i]);
        }
    }

    // Search Employee
    static void searchEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("Employee Found!");
                System.out.println("Employee ID   : " + empId[i]);
                System.out.println("Employee Name : " + empName[i]);
                System.out.println("Basic Salary  : " + basicSalary[i]);
                System.out.println("Total Salary  : " + totalSalary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Update Salary
    static void updateSalary(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("Enter New Basic Salary: ");
                basicSalary[i] = sc.nextDouble();

                double hra = basicSalary[i] * 0.20;
                double da = basicSalary[i] * 0.10;

                totalSalary[i] = basicSalary[i] + hra + da;

                System.out.println("Salary Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Delete Employee
    static void deleteEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                for (int j = i; j < count - 1; j++) {
                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    basicSalary[j] = basicSalary[j + 1];
                    totalSalary[j] = totalSalary[j + 1];
                }

                count--;

                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Salary Records");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewSalary();
                    break;

                case 3:
                    searchEmployee(sc);
                    break;

                case 4:
                    updateSalary(sc);
                    break;

                case 5:
                    deleteEmployee(sc);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
// Write a program to Create employee management system.

import java.util.Scanner;

public class Problem_106 {

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] department = new String[100];
    static int count = 0;

    // Add Employee
    static void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();

        count++;

        System.out.println("Employee Added Successfully!");
    }

    // View Employees
    static void viewEmployees() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("-------------------------");
            System.out.println("Employee ID : " + empId[i]);
            System.out.println("Name        : " + empName[i]);
            System.out.println("Department  : " + department[i]);
        }
    }

    // Search Employee
    static void searchEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("Employee Found!");
                System.out.println("Employee ID : " + empId[i]);
                System.out.println("Name        : " + empName[i]);
                System.out.println("Department  : " + department[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Update Employee
    static void updateEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("Enter New Name: ");
                empName[i] = sc.nextLine();

                System.out.print("Enter New Department: ");
                department[i] = sc.nextLine();

                System.out.println("Record Updated Successfully!");
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
                    department[j] = department[j + 1];
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

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    searchEmployee(sc);
                    break;

                case 4:
                    updateEmployee(sc);
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
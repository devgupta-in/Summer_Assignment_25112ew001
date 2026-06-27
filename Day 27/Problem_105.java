//Write a program to Create student record management system.

import java.util.Scanner;

public class Problem_105 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] roll = new int[100];
        String[] name = new String[100];
        int[] age = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Age: ");
                    age[count] = sc.nextInt();

                    count++;

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Student Records Found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------");
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Age     : " + age[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("Student Found:");
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Age     : " + age[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == updateRoll) {

                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            age[i] = sc.nextInt();

                            System.out.println("Record Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == deleteRoll) {

                            for (int j = i; j < count - 1; j++) {
                                roll[j] = roll[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                            }

                            count--;

                            System.out.println("Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
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
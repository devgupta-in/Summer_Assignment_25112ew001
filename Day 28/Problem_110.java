// Q110 Write a program to Create bank account system.

import java.util.Scanner;

class Problem_110 {

    static double balance = 1000;

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    static void checkBalance() {
        System.out.println("Current Balance : ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double amount;

        do {
            System.out.println("\n----- Bank Account System -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    amount = sc.nextDouble();
                    deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    amount = sc.nextDouble();
                    withdraw(amount);
                    break;

                case 3:
                    checkBalance();
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
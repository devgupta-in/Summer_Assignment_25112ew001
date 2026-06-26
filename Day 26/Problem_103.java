//Write a program to Create ATM simulation.

import java.util.Scanner;

public class Problem_103 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int balance = 10000;
            int choice, amount;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1->{
                        System.out.println("Current Balance: ₹" + balance);}

                    case 2->{
                        System.out.print("Enter amount to deposit: ₹");
                        amount = sc.nextInt();

                        balance = balance + amount;
                        System.out.println("₹" + amount + " deposited successfully.");
                        System.out.println("Updated Balance: ₹" + balance);}

                    case 3->{
                        System.out.print("Enter amount to withdraw: ₹");
                        amount = sc.nextInt();

                        if (amount <= balance) {
                            balance = balance - amount;
                            System.out.println("₹" + amount + " withdrawn successfully.");
                            System.out.println("Remaining Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance!");}
                        }

                    case 4->{
                        System.out.println("Thank you for using our ATM.");}
                    default->{
                        System.out.println("Invalid Choice!");}
                }
            } while (choice != 4);
        }
    }
}
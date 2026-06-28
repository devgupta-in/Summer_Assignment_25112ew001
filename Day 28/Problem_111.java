// Q111 Write a program to Create ticket booking system.

import java.util.Scanner;

class Problem_111 {

    static int availableTickets = 10;

    static void bookTicket(int tickets) {
        if (tickets <= availableTickets) {
            availableTickets -= tickets;
            System.out.println("Ticket Booked Successfully.");
        } else {
            System.out.println("Tickets Not Available.");
        }
    }

    static void showTickets() {
        System.out.println("Available Tickets : " + availableTickets);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- Ticket Booking System -----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Number of Tickets: ");
                    int tickets = sc.nextInt();
                    bookTicket(tickets);
                    break;

                case 2:
                    showTickets();
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
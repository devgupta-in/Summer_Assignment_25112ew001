//Write a program to Create mini library system.

import java.util.Scanner;

class Problem_118 {
    static String[] books = new String[100];
    static int count = 0;

    static void addBook(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        books[count] = sc.nextLine();
        count++;
        System.out.println("Book Added.");
    }

    static void displayBooks() {
        if (count == 0) {
            System.out.println("Library is Empty.");
            return;
        }

        System.out.println("\nAvailable Books");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    static void searchBook(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        String search = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (books[i].equalsIgnoreCase(search)) {
                System.out.println("Book Found.");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Search Book");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook(sc);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
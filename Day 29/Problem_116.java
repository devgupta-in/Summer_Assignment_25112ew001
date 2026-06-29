//Write a program to Create inventory management system.
import java.util.Scanner;

public class Problem_116 {

    static String[] name = new String[20];
    static int[] quantity = new int[20];
    static int count = 0;

    // Add item
    static void addItem(Scanner sc) {

        System.out.print("Enter item name: ");
        name[count] = sc.next();

        System.out.print("Enter quantity: ");
        quantity[count] = sc.nextInt();

        count++;

        System.out.println("Item Added.");
    }

    // Display items
    static void displayItems() {

        if (count == 0) {
            System.out.println("Inventory Empty.");
            return;
        }

        System.out.println("\nInventory List");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - " + quantity[i]);
        }
    }

    // Search item
    static void searchItem(Scanner sc) {

        System.out.print("Enter item name: ");
        String item = sc.next();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(item)) {

                System.out.println("Item Found");
                System.out.println("Quantity = " + quantity[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("Item Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Inventory Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addItem(sc);
                    break;

                case 2:
                    displayItems();
                    break;

                case 3:
                    searchItem(sc);
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
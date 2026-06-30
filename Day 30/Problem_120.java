// Write a program to Develop complete mini project using arrays, strings and functions.

import java.util.Scanner;

class Problem_120 {

    static int[] productId = new int[100];
    static String[] productName = new String[100];
    static int[] quantity = new int[100];
    static double[] price = new double[100];
    static int count = 0;

    static void addProduct(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName[count] = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity[count] = sc.nextInt();

        System.out.print("Enter Price: ");
        price[count] = sc.nextDouble();

        count++;
        System.out.println("Product Added Successfully.");
    }

    static void displayProducts() {
        if (count == 0) {
            System.out.println("No Products Available.");
            return;
        }

        System.out.println("\n------ Product List ------");
        for (int i = 0; i < count; i++) {
            System.out.println("ID : " + productId[i]);
            System.out.println("Name : " + productName[i]);
            System.out.println("Quantity : " + quantity[i]);
            System.out.println("Price : " + price[i]);
            System.out.println("--------------------------");
        }
    }

    static void searchProduct(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                System.out.println("Product Found");
                System.out.println("Name : " + productName[i]);
                System.out.println("Quantity : " + quantity[i]);
                System.out.println("Price : " + price[i]);
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    static void updateQuantity(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                System.out.print("Enter New Quantity: ");
                quantity[i] = sc.nextInt();
                System.out.println("Quantity Updated Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    static void deleteProduct(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {

                for (int j = i; j < count - 1; j++) {
                    productId[j] = productId[j + 1];
                    productName[j] = productName[j + 1];
                    quantity[j] = quantity[j + 1];
                    price[j] = price[j + 1];
                }

                count--;
                System.out.println("Product Deleted Successfully.");
                return;
            }
        }

        System.out.println("Product Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct(sc);
                    break;
                case 4:
                    updateQuantity(sc);
                    break;
                case 5:
                    deleteProduct(sc);
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
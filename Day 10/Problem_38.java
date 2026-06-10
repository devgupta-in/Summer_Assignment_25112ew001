// Write a program to Print reverse pyramid.

public class Problem_38 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
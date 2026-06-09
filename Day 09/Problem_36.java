// Write a program to Print hollow square pattern.

public class Problem_36 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Outer loop for columns
            for (int j = 1; j <= 5; j++) {

                // Print star on border
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to next line
            System.out.println();
        }
    }
}
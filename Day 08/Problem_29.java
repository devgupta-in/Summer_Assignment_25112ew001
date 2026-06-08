// Write a program to Print half pyramid pattern.

public class Problem_29 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
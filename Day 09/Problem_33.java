// Write a program to Print reverse star pattern.

public class Problem_33 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
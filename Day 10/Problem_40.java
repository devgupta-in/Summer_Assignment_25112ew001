// Write a program to Print character pyramid.

public class Problem_40 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j));
            }

            // Print decreasing characters
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(64 + j));
            }

            // Move to next line
            System.out.println();
        }
    }
}
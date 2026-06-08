// Write a program to Print repeated-number pattern.

public class Problem_32 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Print same number i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Move to next line
            System.out.println();
        }
    }
}
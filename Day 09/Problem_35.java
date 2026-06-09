// Write a program to Print repeated character pattern.

public class Problem_35 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Print same character i times
            for (int j = 1; j <= i; j++) {

                // 64 + i gives A, B, C, D, E
                System.out.print((char)(64 + i));
            }

            // Move to next line
            System.out.println();
        }
    }
}
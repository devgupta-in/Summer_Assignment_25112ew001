// Write a program to Print reverse number triangle.

public class Problem_34 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }
    }
}

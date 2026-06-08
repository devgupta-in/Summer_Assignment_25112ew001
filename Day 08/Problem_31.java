// Write a program to Print character triangle.

public class Problem_31 {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop for columns
            for (int j = 1; j <= i; j++) {

                // 65 is ASCII value of 'A'
                System.out.print((char)(64 + j));
            }

            // Move to next line
            System.out.println();
        }
    }
}
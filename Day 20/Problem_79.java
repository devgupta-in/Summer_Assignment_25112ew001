// Q79 Write a program to Find row-wise sum.

public class Problem_79 {

    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 3; j++) {

                sum = sum + a[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}
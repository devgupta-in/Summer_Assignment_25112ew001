// Q75 Write a program to Transpose matrix.

public class Problem_75 {

    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(a[j][i] + " ");
            }

            System.out.println();
        }
    }
}
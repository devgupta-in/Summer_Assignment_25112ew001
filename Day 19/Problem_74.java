// Q74 Write a program to Subtract matrices.

public class Problem_74 {

    public static void main(String[] args) {

        int a[][] = {
                {8, 6},
                {4, 2}
        };

        int b[][] = {
                {1, 2},
                {3, 4}
        };

        int sub[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of matrices:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(sub[i][j] + " ");
            }

            System.out.println();
        }
    }
}
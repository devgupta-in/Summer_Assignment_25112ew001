// Q78 Write a program to Check symmetric matrix.

public class Problem_78 {

    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        boolean symmetric = true;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (a[i][j] != a[j][i]) {

                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {

            System.out.println("Matrix is Symmetric");
        }

        else {

            System.out.println("Matrix is Not Symmetric");
        }
    }
}
// Write a program to Find common elements.

public class Problem_68 {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 2, 4, 7, 8};

        System.out.print("Common Elements: ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
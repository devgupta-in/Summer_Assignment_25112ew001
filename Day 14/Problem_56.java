// Write a program to find duplicate elements in an array.

public class Problem_56 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 2, 8, 4, 9, 7, 10};

        System.out.println("Duplicate elements are:");

        // Compare each element with remaining elements
        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicatePrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicatePrinted = true;
                    break;
                }
            }

            if (isDuplicatePrinted) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
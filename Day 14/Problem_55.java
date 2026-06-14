// Find second largest element using sorting

import java.util.Arrays;

public class Problem_55 {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 34, 90,27, 99, 89, 38, 25, 86, 100, 56};

        // Sort the array
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        int secondLargest = 0;

        // Reverse loop
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second largest element = " + secondLargest);
    }
}
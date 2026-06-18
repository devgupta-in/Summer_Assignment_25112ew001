// Write a program to Binary search.
public class Problem_71 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};

        int target = 8;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
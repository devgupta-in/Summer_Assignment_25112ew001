// Write a program to Rotate array right.

public class Problem_59 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;

        //storing last element of array
        int last = arr[n-1];
        
        //shifting the index
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        
        //adding the last element at last
        arr[0] = last;

        System.out.print("Array after right rotation: ");
        for( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
// Write a program to Rotate array left.

public class Problem_58 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;

        //storing first element of array
        int first = arr[0];
        
        //shifting the index
        for( int i = 0; i < n-1; i++){
            arr[i] = arr[i + 1];
        }
        
        //adding the first element at last
        arr[n-1] = first;

        System.out.print("Array after left rotation: ");
        for( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
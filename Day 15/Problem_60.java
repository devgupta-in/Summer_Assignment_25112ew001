// Write a program to Move zeroes to end.

public class Problem_60 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 4, 0, 2, 5, 0, 2, 0, 0};
        int n = arr.length;

        int index = 0;

        //moving every non-zero element to starting
         for( int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
         }
        
        // filling remaining spaces with zero
        while(index < n){
            arr[index] = 0;
            index++;
        }
        System.out.print("Array after moving zeroes to end: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Write a program to Reverse array.

public class Problem_57 {
    public static void main(String[] args) {

        int[] arr = {1, 6, 75, 23, 74, 98 ,24 ,65 ,26};
        int n = arr.length;

        int[] reverse = new int[n];
            
        for( int i = 0; i < n; i++){
            reverse[i] = arr[n - 1- i];
        }
        System.out.print("Reversed array is: ");
        for( int i = 0; i < n; i++){
            System.out.print(reverse[i]+ " ");
        }
    }        
    
}

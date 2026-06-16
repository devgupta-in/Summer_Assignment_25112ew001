// Write a program to Find missing number in array.

public class Problem_61 {
    static int findMissing(int[] arr, int n){
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int num : arr){
            actualSum = actualSum + num;
        }
        return expectedSum - actualSum;
    }   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        
        int missing = findMissing(arr, n);
        System.out.println("Missing number in array: " + missing);
    } 
}

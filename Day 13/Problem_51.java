//Write a program to Find largest and smallest element.

public class Problem_51{
    public static void main(String[] args) {
        int arr[] = {12, 32, 5, 42, 21, 65, 111};

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
         }
        System.out.println("The maximum value of array: " + max);
        System.out.println("The minimum value of array: " + min);
    }
}
// Write a program to Find sum and average of array.


public class Problem_50{
    public static void main(String[] args) {
        float avg;
        int sum = 0;

        int arr[] = {1, 2, 3, 4, 5, 6};
        int totalEle = arr.length;

        for(int i = 0; i < totalEle; i++){
            sum = sum + arr[i];
        }

        avg = (float)sum/totalEle;
        System.out.println("Average of Element of arrays " + avg);
    }
}
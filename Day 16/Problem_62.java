//Write a program to Find maximum frequency element.

public class Problem_62 {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 2, 3, 1, 2, 4, 2};
        
        int maxCount = 0;
        int maxElement = arr[0];

        for(int i = 0; i < arr.length; i++){

            int count = 0;
            
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            
            if(count > maxCount){
                maxCount = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum frequency element: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}

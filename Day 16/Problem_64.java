//Write a program to Remove duplicates from array.

public class Problem_64 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        for(int i = 0; i < arr.length; i++){
            
            boolean dublicate = false;
            
            for( int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    dublicate = true;
                    break;
                }
            }
            // print if not dublicate
            if(!dublicate){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
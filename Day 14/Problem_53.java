// Write a program to Linear search.

import java.util.Scanner;
public class Problem_53 {
    public static void main(String[] args) {

        int[] arr = { 23, 53, 43, 56, 57, 86, 23};
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();

        int indexOfNum = 0;
        
        for( int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                indexOfNum = i;
            }
        }
        System.out.println("The index of " + num + " is : " + indexOfNum);

        sc.close();
    }
    
}

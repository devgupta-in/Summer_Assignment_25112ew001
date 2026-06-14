// Write a program to Frequency of an element.

import java.util.Scanner;
public class Problem_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2, 4, 6, 2, 8, 2, 5, 4};

        System.out.print("Enter the element whose frequency you want to find: ");
        int target = sc.nextInt();

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if( target == arr[i]){
                count++;
            }
        }
        System.out.println("Frequency of " + target + " = " + count);
        
        sc.close();
    }
    
}

import java.util.Scanner;

public class problem_08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        int a = n;

        int num = 0;

         while(n !=0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n = n / 10;
            
        }
        if(num == a){
            System.out.println("The number is a palindrome.");
        } 
        else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}

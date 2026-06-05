//Write a program to Check strong number.

import java.util.Scanner;
public class Problem_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = scan.nextInt();

        int flag = num;
        int sum = 0;
        
        while(num!=0){
            int digit = num%10;
            int fact = 1;
            for(int i = 1; i<=digit; i++){
                fact = fact*i;
            }
            sum = sum + fact;
            num = num/10;
        }
        if(flag == sum){
            System.out.println(sum + " is a strong number.");
        }
        else{
            System.out.println(sum + " is not a strong number.");
        }
        scan.close();
    }
}

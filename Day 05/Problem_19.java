//Write a program to Print factors of a number.

import java.util.Scanner;
public class Problem_19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = scan.nextInt();

        System.out.println("Factors of " + num + " is:");

        for(int i = 1; i<num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}

// Write a program to Write function to check prime.

import java.util.Scanner;

public class Problem_43 {
    static boolean isPrime(int x){
        if(x <= 1){
             return false;
        }
        for(int i = 2; i <= x/2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        boolean prime = isPrime(a);
        if(prime){
            System.out.print("The number is Prime");
        }else{
            System.out.print("The number is not Prime");
        }
        sc.close();
    }
}


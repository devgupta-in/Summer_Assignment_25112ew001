//Write a program to Write function for Armstrong.
import java.util.Scanner;

public class Problem_46 {

    // Function to check Armstrong number
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit; // For 3-digit Armstrong numbers
            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
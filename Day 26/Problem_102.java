// Write a program to Create voting eligibility system.

import java.util.Scanner;

public class Problem_102 {

    static String eligibilityCriteria(int age){
        if(age >= 18){
            return "You are eligible for voting in election.";
        }else{
            return "You are not eligible for voting in election";
        }
    }
    public static void main(String[] args) {
        int age;
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter your age:");
            age = sc.nextInt();
        }

        String elibility = eligibilityCriteria(age);
        System.out.print(elibility);
    }
}
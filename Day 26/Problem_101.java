// // Write a program to Create Number Guessing Game

import java.util.Random;
import java.util.Scanner;

public class Problem_101 {
    public static void main(String[] args) {

        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter Lower Limit: ");
            int min = scanner.nextInt();

            System.out.print("Enter Upper Limit: ");
            int max = scanner.nextInt();

            if (min > max) {
                System.out.println("Invalid Range!");
                return;
            }

            int targetNumber = random.nextInt((max - min) + 1) + min;

            int guess = 0;
            int attempts = 0;

            while (guess != targetNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber)
                    System.out.println("Too Low!");
                else if (guess > targetNumber)
                    System.out.println("Too High!");
                else
                    System.out.println("Correct! Attempts: " + attempts);
            }
        }
    }
}
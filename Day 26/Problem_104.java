// Write a program to Create Quiz Application.

import java.util.Scanner;

public class Problem_104 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String[] questions = {
                    "1. What is the capital of India?",
                    "2. Which language is used to develop Android apps?",
                    "3. Which keyword is used to create an object in Java?",
                    "4. What is 10 + 20?",
                    "5. Who is known as the Father of Java?"
            };

            String[][] options = {
                    {"A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"},
                    {"A. Python", "B. Java", "C. C", "D. HTML"},
                    {"A. object", "B. new", "C. class", "D. create"},
                    {"A. 10", "B. 20", "C. 30", "D. 40"},
                    {"A. Dennis Ritchie", "B. James Gosling", "C. Bjarne Stroustrup", "D. Guido van Rossum"}
            };

            char[] answers = {'B', 'B', 'B', 'C', 'B'};

            int score = 0;

            System.out.println("===== JAVA QUIZ APPLICATION =====");

            for (int i = 0; i < questions.length; i++) {

                System.out.println("\n" + questions[i]);

                for (String option : options[i]) {
                    System.out.println(option);
                }

                System.out.print("Enter your answer (A/B/C/D): ");
                char userAnswer = Character.toUpperCase(sc.next().charAt(0));

                if (userAnswer == answers[i]) {
                    System.out.println("✅ Correct!");
                    score++;
                } else {
                    System.out.println("❌ Wrong!");
                    System.out.println("Correct Answer: " + answers[i]);
                }
            }

            System.out.println("\n===== RESULT =====");
            System.out.println("Correct Answers : " + score);
            System.out.println("Wrong Answers   : " + (questions.length - score));
            System.out.println("Score           : " + score + "/" + questions.length);

            switch (score) {
                case 5 -> System.out.println("Excellent! 🎉");
                case 4 -> System.out.println("Very Good! 👍");
                case 3 -> System.out.println("Good! 🙂");
                case 2 -> System.out.println("Average! Keep Practicing.");
                default -> System.out.println("Better Luck Next Time!");
            }
        }
    }
}
// Q86 Write a program to Count words in a sentence.

public class Problem_86 {

    public static void main(String[] args) {

        String str = "I am learning Java";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {

                count++;
            }
        }

        System.out.println("Number of Words = " + count);
    }
}
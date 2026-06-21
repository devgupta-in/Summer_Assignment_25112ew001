// Q87 Write a program to Character frequency.

public class Problem_87 {

    public static void main(String[] args) {

        String str = "programming";

        char ch = 'g';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {

                count++;
            }
        }

        System.out.println("Frequency of " + ch + " = " + count);
    }
}

// Q85 Write a program to Check palindrome string.

public class Problem_85 {

    public static void main(String[] args) {

        String str = "madam";

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {

            System.out.println("Palindrome String");
        }

        else {

            System.out.println("Not Palindrome String");
        }
    }
}
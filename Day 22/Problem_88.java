// Q88 Write a program to Remove spaces from string.

public class Problem_88 {

    public static void main(String[] args) {

        String str = "Hello World Java";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {

                result = result + ch;
            }
        }

        System.out.println("Original String = " + str);

        System.out.println("After Removing Spaces = " + result);
    }
}
// Q91 Write a program to Check anagram strings.

public class Problem_91 {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {

            System.out.println("Not Anagram");
            return;
        }

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {

                    count++;
                    break;
                }
            }
        }

        if (count == str1.length()) {

            System.out.println("Anagram Strings");
        }

        else {

            System.out.println("Not Anagram");
        }
    }
}

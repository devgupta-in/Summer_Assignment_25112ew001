// Q95 Write a program to Find longest word.

public class Problem_95 {

    public static void main(String[] args) {

        String str = "I am learning Java Programming";

        String words[] = str.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {

                longest = words[i];
            }
        }

        System.out.println("Longest Word = " + longest);
    }
}

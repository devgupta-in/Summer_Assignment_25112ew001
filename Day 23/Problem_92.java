// Q92 Write a program to Find maximum occurring character.

public class Problem_92 {

    public static void main(String[] args) {

        String str = "programming";

        char maxChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }
            }

            if (count > maxCount) {

                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum Occurring Character = " + maxChar);
        System.out.println("Frequency = " + maxCount);
    }
}

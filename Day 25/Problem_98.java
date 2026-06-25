//Write a program to Find common characters in strings.

import java.util.Scanner;

public class Problem_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    System.out.print(ch + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
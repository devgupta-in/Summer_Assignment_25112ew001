// Q93 Write a program to Check string rotation.

public class Problem_93 {

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        String temp = str1 + str1;

        if (temp.contains(str2)) {

            System.out.println("String is Rotation");
        }

        else {

            System.out.println("String is Not Rotation");
        }
    }
}

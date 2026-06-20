// Q81 Write a program to Find string length without strlen().

public class Problem_81 {

    public static void main(String[] args) {

        String str = "Hello World";

        int count = 0;

        for (int i = 0; i < str.toCharArray().length; i++) {

            count++;
        }

        System.out.println("Length = " + count);
    }
}
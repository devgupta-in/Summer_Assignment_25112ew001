// Write a program to Merge arrays.

public class Problem_65 {
    public static void main(String[] args) {

        int[] array1 = {12, 34, 56};
        int[] array2 = {78, 90};

        int[] mergedArray = new int[array1.length + array2.length];
        
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[index] = array1[i];
            index++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[index] = array2[i];
            index++;
        }
        
        System.out.println("Merged Array: " );
        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }
}

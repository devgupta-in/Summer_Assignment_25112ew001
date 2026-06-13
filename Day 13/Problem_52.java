// Write a program to Count even and odd elements.

public class Problem_52{
    public static void main(String[] args) {
        int arr[] = {12, 32, 5, 42, 21, 65, 111, 234, 453, 345, 345, 211};

        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The total even number: " + even);
        System.out.println("The total odd number: " + odd);
    }
}
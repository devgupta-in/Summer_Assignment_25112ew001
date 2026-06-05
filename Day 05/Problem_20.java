import java.util.Scanner;
public class Problem_20{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int num = scan.nextInt();

        int gpf = 1;

        
        System.out.print("Factors of " + num + " is:");

        for(int i = 1; i<num; i++){
            if(num%i==0){
                System.out.print(i + " ");
                int prime = 1;
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        prime=0;
                        break;
                    }
                }
                if(prime==1){
                    gpf = i;
                }
            }
        }
        System.out.println();
        System.out.println("Greatest Prime Factor : " + gpf);
        scan.close();
   }
}

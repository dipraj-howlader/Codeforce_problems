import java.util.Scanner;

public class DistanceandAxis {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int k = iScanner.nextInt();
            if(k>n){
                System.out.println(k-n);
            }
            else
           {
               if(n%2 == k%2)
               System.out.println(0);
               else
               System.out.println(1);
           }

        }
    }
}

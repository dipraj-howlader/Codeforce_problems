import java.util.Scanner;

public class MochaAndMath {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            long[] arr = new long[n];
            for(int i = 0;i<n;i++)
            arr[i] = iScanner.nextLong();

            long ans = arr[0];
            // long ans = 0;
            for(int i=1;i<n;i++){
                ans = ans & arr[i];
            } 
            System.out.println(ans);
        }   
    }
}

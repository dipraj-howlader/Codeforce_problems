import java.util.Arrays;
import java.util.Scanner;

public class MaximumCakeTastiness {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            int n = iScanner.nextInt();
            long[] num = new long[n];
            for(int i=0;i<n;i++){
                num[i] = iScanner.nextLong();
            }
            Arrays.sort(num);
            long sum = num[n-1]+num[n-2];
            System.out.println(sum);
            test--;
        }
    }
}

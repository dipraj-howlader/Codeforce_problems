import java.util.Arrays;
import java.util.Scanner;

public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test  = iScanner.nextInt();
        while(test>0){
            int n = iScanner.nextInt();
            long[] number = new long[n];
            for(int i=0;i<n;i++){
                number[i] = iScanner.nextLong();
            }
            Arrays.sort(number);
            System.out.println(number[n-1]-number[0]);
            test--;
        }
    }
}

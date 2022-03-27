import java.util.Arrays;
import java.util.Scanner;
//unsolved
public class CF2problem2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int len = iScanner.nextInt();
            long k = iScanner.nextLong();
            long[] arr = new long[len];
            long[] arr2 = new long[len];
            for(int i = 0;i<len;i++){
                arr[i] = iScanner.nextLong();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            long low = arr2[0];

        }
    }
}

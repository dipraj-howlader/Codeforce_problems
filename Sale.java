import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-05----08:49:19
 * @modify date 2022-04-05----12:26:34
 * @desc [description]
 */
public class Sale {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int m = iScanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = iScanner.nextInt();
        }
        Arrays.sort(arr);
        int sum =0;
        for(int i =0;i<m;i++){
            if(arr[i]>=0)
            break;
            sum = sum + arr[i];
        }
        System.out.println(-1*sum);
    }
}

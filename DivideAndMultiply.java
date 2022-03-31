/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-03-31----13:52:20
 * @modify date 2022-03-31----13:52:20
 * @desc [description]
 */
import java.util.Arrays;
import java.util.Scanner;

public class DivideAndMultiply {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int n = iScanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = iScanner.nextInt();
            Arrays.sort(arr);
            long countK = 0;
            long temp = 0;
            long highValue = 0;
            for(int i=0;i<n;i++){
                while(arr[i]%2==0){
                    countK++;
                    arr[i]/=2;
                }
                highValue+=arr[i];
               temp =  Long.max(temp, arr[i]);
            }
            long res = temp*(long) Math.pow(2, countK)+highValue-temp;
            System.out.println(res);
        }
        iScanner.close();
    }
}

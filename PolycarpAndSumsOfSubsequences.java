/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-12----00:45:18
 * @modify date 2022-04-12----00:45:18
 * @desc GHUM ASE NA, PASER BASAR MAIYA KE IGNORE KORA SURU KORCI TAI
 */
import java.util.Scanner;

/**
 * PolycarpAndSumsOfSubsequences
 */
public class PolycarpAndSumsOfSubsequences {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = 7;
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = iScanner.nextInt();
            int b1 = arr[0];
            int b2 = arr[1];
            int b3 = arr[6]-b1-b2;
            System.out.println(b1+" "+b2+" "+b3);

        }
    }
}
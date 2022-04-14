/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-14----12:35:28
 * @modify date 2022-04-14----12:35:28
 * @desc long long ago..
 */
import java.util.Scanner;

public class K_thNotDivisiblebyn {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n = iScanner.nextLong();
            long k = iScanner.nextLong();
            long shift = (k-1)/(n-1);
            System.out.println(shift+k);
        }
    }
}

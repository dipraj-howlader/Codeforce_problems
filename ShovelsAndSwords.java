import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-01----13:06:08
 * @modify date 2022-04-01----13:06:08
 * @desc [description]
 */
public class ShovelsAndSwords {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = (a+b)/3;
            long d = Long.min(a, b);
            System.out.println(Long.min(d, c));
            }
        }
    }

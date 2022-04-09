/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-09----22:05:43
 * @modify date 2022-04-09----22:05:43
 * @desc [description]
 */
import java.util.Scanner;

public class GettingZero {
    public static void main(String[] args) {
        //unsolved
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            int n = iScanner.nextInt();
            int number =n;
            int i = prime(n);
            int count = 0;
            int minus = 32768-n;
            if(i==1){
                n = (n+1)%32768;
                count++;
            }
            while(n%32768!=0){
                n = (n*2)%32768;
                if(number-n>0 && number-n<=count)
                {
                    minus = number-n;
                    break;
                }
                count++;
            }
            if(minus<count){
                System.out.println(minus);
            }
            else
            System.out.println(count);
            test--;
        }
    }

    private static int prime(int n) {
        if(n<=1) return 0;
        for(int i=2;i*i<=n;i++)
        if(n%i==0)
        return 0;
        return 1;
    }
}

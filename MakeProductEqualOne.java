
/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-27----22:16:37
 * @modify date 2022-04-27----22:57:19
 * @desc vai re vai ki ada
 */
import java.util.Scanner;

public class MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int neg = 0;
        int pos = 0;
        int countZero = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
           long a  = iScanner.nextLong();
            if(a==1){
                pos++;
            }
            else if(a==-1){
                neg++;
            }
            else if(a==0){
                countZero++;
            }
            else if(a<-1){
                count = count + (int) Math.abs(a+1);
                neg++;
            }
            else if(a>1){
                count = count + a - 1;
                pos++;
            }
        }
        count = count + countZero;
        if(neg%2!=0){
            if(countZero<=0)
            count = count + 2;
        }
        System.out.println(count);
    }
}

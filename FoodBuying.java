/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-28----20:47:41
 * @modify date 2022-04-28----20:47:41
 * @desc Thanks Tazim for tips
 */
import java.util.Scanner;

public class FoodBuying {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long s = iScanner.nextLong();
            long support = 0;
            long sum = 0;
            while(s>0){
                if(s<10){
                    sum = sum + s;
                    s=0;
                }
                else if(s%10!=0){
                    support = s%10;
                    s = s -support;
                    sum = sum + s;
                    s = s/10;
                    s = s+support;
                }
                else{
                    sum = sum + s;
                    s = s/10;
                }
            }
            System.out.println(sum);
        }
    }
}

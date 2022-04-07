import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-03----21:54:29
 * @modify date 2022-04-03----21:54:29
 * @desc [description]
 */
/**
 * MultiplyByTwoAndDivBySix
 */
public class MultiplyByTwoAndDivBySix {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            int count2=0;
            int count3 = 0;
            while(a%2==0)
            {
                a/=2;
                count2++;
            }
            while(a%3==0)
            {
                a/=3;
                count3++;
            }
            if(a==1 && count3>=count2)
            System.out.println(count3-count2 +count3);
            else
            System.out.println(-1);
        }
    }
    
}
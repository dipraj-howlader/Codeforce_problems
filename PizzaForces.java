/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-28----19:55:52
 * @modify date 2022-04-28----19:55:52
 * @desc thanks Tazim Bro
 */
import java.util.Scanner;

public class PizzaForces {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n = iScanner.nextLong();
            if(n<=6)
            System.out.println(15);
            else{
                System.out.println(((n+1)/2)*5);
            }
        }
    }
}

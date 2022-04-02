/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-02----21:23:57
 * @modify date 2022-04-02----21:23:57
 * @desc [description]
 */
import java.util.Scanner;
 
/**
 * Round780_A
 */
public class Round780_A {
 
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int t = iScanner.nextInt();
        while(t>0){
            t--;
            long aa = iScanner.nextLong();
            long bb = iScanner.nextLong();
            if(aa==0)
            System.out.println(1);
            else{
              long  res = (bb*2 + aa)+1;
                System.out.println(res);
            }
            
        }
        iScanner.close();
    }
}

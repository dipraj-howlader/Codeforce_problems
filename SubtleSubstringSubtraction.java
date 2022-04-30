/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-30----20:57:22
 * @modify date 2022-04-30----20:57:22
 * @desc [solved]
 */
import java.util.Scanner;

public class SubtleSubstringSubtraction {
    public static void main(String[] args) {
        // int a = 'a'-96;
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            String sb = iScanner.next();
            StringBuilder str = new StringBuilder(sb);
            int len = str.length();
            long sumAlicce = 0;
            long sumBob = 0;
            if(len%2==0){

                for(int i=0;i<len;i++){
                    long abs = str.charAt(i)-96;
                    sumAlicce = sumAlicce +abs;
                }
                System.out.println("Alice" + " "+sumAlicce);
            }
            else{
                if(str.charAt(0)>str.charAt(len-1)){
                    long abs = str.charAt(len-1);
                    sumBob = abs - 96;
                    str = str.deleteCharAt(len-1);
                }
                else{
                    long abs = str.charAt(0);
                    sumBob = abs - 96;
                    str = str.deleteCharAt(0);
                }
                
                len =len-1;
                for(int i =0;i<len;i++){
                   long abs = str.charAt(i)-96;
                    sumAlicce = sumAlicce +abs;
                }
                long dif = (long) Math.abs(sumAlicce-sumBob);
                if(sumAlicce>sumBob){
                    System.out.println("Alice"+" "+dif);
                }
                else{
                    System.out.println("Bob"+" "+dif); 
                }
            }
        }
    }
}
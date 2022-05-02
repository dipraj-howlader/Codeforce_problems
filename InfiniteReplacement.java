/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-05-02----21:58:18
 * @modify date 2022-05-02----21:58:18
 * @desc UNISOLVED
 */
import java.util.Arrays;
import java.util.Scanner;

public class InfiniteReplacement {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            String str1 = iScanner.next();
            String str2 = iScanner.next();
            int len = str1.length();
            char[] arr = str2.toCharArray();
            Arrays.sort(arr);
            str2 = String.valueOf(arr);
            StringBuilder str = new StringBuilder(str2);
            System.out.println(str);
            int hoiOK=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='a')
                {
                    hoiOK=1;
                    str = str.deleteCharAt(i);
                }
            }
            int pintu = 0;
            for(int i=1;i<str.length();){
                if(str.charAt(i)==str.charAt(i-1))
                str =str.deleteCharAt(i-1);
                else{
                    i++;
                }
                pintu = 1;
            }
        
            int len2  = str.length();
            if(len2==0)
            System.out.println(1);
            else if(hoiOK==1 && pintu==1)
            System.out.println(-1);
            else{
                int lenFinal = len*len2;
                System.out.println(lenFinal+1);
            }

        }
    }
}

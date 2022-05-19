import java.util.Scanner;

/**
 * contest2
 */
public class contest2 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n = iScanner.nextLong();
            
            String str = String.valueOf(n);
            int len = str.length();
            long minValue = Long.MAX_VALUE;
            long min = n;
            for(int i= 1;i<=len;i++){
                long left = min%10;
                min = min/10;
                if(left<minValue)
                minValue = left;
            }

            if(len==2){
                System.out.println(str.charAt(1));
            }
            else{
                System.out.println(minValue);
            }
        }
    }
}
import java.util.Scanner;

public class DIVMOD {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long low = iScanner.nextLong();
            long high = iScanner.nextLong();
            long a = iScanner.nextLong();
            long ans = high/a + high%a;
            long m = high/a * a-1;
            if(m>=low)
            ans = Long.max(ans, m/a + m%a);
            System.out.println(ans);
        }
    }
}

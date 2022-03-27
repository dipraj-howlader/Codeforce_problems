import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        
        while (test > 0) {
            test--;
            long s = iScanner.nextLong();
            if (s % 2 == 1) {
                System.out.println("YES");
            } else {
                while(s%2==0){
                s=s/2;
                }
                if(s>1 && s%2==1)
                System.out.println("YES");
                else
                System.out.println("NO");

            }
        }
    }
}

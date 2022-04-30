import java.util.Scanner;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            if(a==b){
                System.out.println(0 +" "+0);
            }
            else{
            long gcd = (long) Math.abs(a-b);
            long min = Long.min(a%gcd, (gcd - (a%gcd)));
            System.out.println(gcd +" "+min);
        }
    }
    }
}

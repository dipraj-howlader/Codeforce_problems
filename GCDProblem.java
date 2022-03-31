import java.util.Scanner;

/**
 * GCDProblem
 * Author @Dipraj Howlader
 * dipraj17@cse.pstu.ac.bd
 */

public class GCDProblem {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            long n = iScanner.nextLong();
            long gcd = 0;
            long a=1;
            long b=0;
            while(gcd!=1){
                a++;
                b= n-a-1;
                gcd = calculateGCD(b,a);

            }
            System.out.println(a+" "+b+ " "+1);
        }
    }

    private static long calculateGCD(long a, long b) {
        if(a%b==0) return b;
        return calculateGCD(b, a%b);
    }

}
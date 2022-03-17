import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
 
        long n = iScanner.nextLong();
        long a = iScanner.nextLong();
        long b = iScanner.nextLong();
 
        long r = n/(a+b);
        long rr = n%(a+b);
 
        System.out.println(r*a + Math.min(rr, a));
    }
}
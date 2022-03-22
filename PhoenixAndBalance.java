import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test --;
            long n = iScanner.nextLong();
            n--;
            n = (int) Math.pow(2, n) -2;
            System.out.println(n);
        }
    }
}

import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        long reminder = 0;
        for(int i=1;i<=test;i++){
            long x =iScanner.nextLong();
            long y = iScanner.nextLong();
            long n = iScanner.nextLong();
            long stay = n/x;
            long total =stay*x + y;
            while(total>n){
                stay--;
                total = stay*x + y;
            }
            System.out.println(total);
        }   
    }
}

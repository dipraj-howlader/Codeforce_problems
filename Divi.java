import java.util.Scanner;

public class Divi {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test --;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = iScanner.nextLong();
            long y = c * b + b;
            long x = y + a;
            System.out.println(x +" " + y +" " + c); 
        }
    }
}

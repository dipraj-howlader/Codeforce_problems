import java.util.Scanner;

public class BadBoy {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = iScanner.nextLong();
            long d = iScanner.nextLong();
            System.out.println(1 + " "+ 1 + " "+a +" "+b);
        }
    }
}

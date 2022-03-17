import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int j = 1;j<=test;j++){
            long num = iScanner.nextLong();
            System.out.println((int)(num+1)/10);

        }
    }
}

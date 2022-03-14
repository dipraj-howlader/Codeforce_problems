import java.util.Scanner;

public class SashaAndSticks {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        long n = iScanner.nextLong();
        long k = iScanner.nextLong();
        if((n/k)%2==0)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}

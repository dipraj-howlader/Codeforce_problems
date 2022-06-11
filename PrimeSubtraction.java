import java.util.Scanner;
public class PrimeSubtraction {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    int test= iScanner.nextInt();
        while(test>0)
        {
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            if(a-b!=1){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}

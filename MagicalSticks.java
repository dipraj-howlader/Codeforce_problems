import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n = iScanner.nextLong();
            if(n%2==0){
                System.out.println(n/2);
            }
            else
            System.out.println((n/2)+1);
        }
    }
}

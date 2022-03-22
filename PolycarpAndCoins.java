import java.util.Scanner;

/**
 * PolycarpAndCoins
 */
public class PolycarpAndCoins {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n = iScanner.nextLong();
            if(n%3==1)
            System.out.println(((n/3)+1) +" "+n/3);
            else if(n%3==0)
            System.out.println(n/3 + " "+ n/3);
            else
            System.out.println(n/3 + " "+((n/3)+1));

        }
    }
    
}
import java.util.Scanner;

/**
 * BuyAShovel
 */
public class BuyAShovel {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int k = iScanner.nextInt();
        int n = iScanner.nextInt();
        int i =0;
        int holding;
        boolean ok = true;
        while(ok == true){
            i++;
            holding = k * i;
            if(holding%10==0 || holding %10 == n){
                ok = false;
            }
        }
        System.out.println(i);
    }
}
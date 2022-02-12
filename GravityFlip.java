import java.util.Arrays;
import java.util.Scanner;

/**
 * GravityFlip
 */
public class GravityFlip {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] clubs = new int[n];
        for(int i=0;i<n;i++){
            clubs[i]=iScanner.nextInt();
        }
        Arrays.sort(clubs);
        for(int x: clubs)
            System.out.print(x + " ");
    }
    
}
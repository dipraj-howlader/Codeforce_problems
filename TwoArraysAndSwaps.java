import java.util.Arrays;
import java.util.Scanner;

/**
 * TwoArraysAndSwaps
 */
public class TwoArraysAndSwaps {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        for(int i=1;i<=n;i++){
            int length = iScanner.nextInt();
            int swap = iScanner.nextInt();
            int[] a = new int[length];
            int[] b = new int[length];
            for(int y = 0;y<length;y++){
                a[y] = iScanner.nextInt();
            }
            for(int y = 0;y<length;y++){
                b[y] = iScanner.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int sum =0;
            int count=0;
            for(int z=0;z<swap;z++){
                int first = a[z];
                int second = b[length-z-1];
                if(a[z]<b[length-z-1]){
                    sum = sum + b[length-z-1];
                }
                else 
                sum = sum + a[z];
            }
            for(count = swap; count<length; count++){
                sum = sum + a[count];
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }
    }
}
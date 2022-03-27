import java.util.Arrays;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int len  = iScanner.nextInt();
        int[] buckets = new int[n];
        for(int i=0;i<n;i++){
            buckets[i] = iScanner.nextInt();
        }
        int count = 0;
        Arrays.sort(buckets);
        while(n>0){
            if(len%buckets[n-1]==0){
                count = len/buckets[n-1];
                break;
            }
            n--;
        }
        System.out.println(count);
        iScanner.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       int n = iScanner.nextInt();
       int l = iScanner.nextInt();
       int[] lines = new int[n];
       for(int i =0;i<n;i++){
           lines[i] = iScanner.nextInt();
       }
       Arrays.sort(lines);
    int min = lines[0] - 0;
    int max = l-lines[n-1];

    int large = 0;
    if(min>max)
        large = min;
    else 
        large = max;
    int distance = 0;

    for(int i=1;i<n;i++){
        int diff = lines[i] - lines[i-1];
        if(diff>distance)
            distance = diff;

    }
    double lits = distance/2.0000000000;
    double largest = large;
    if(lits>largest)
        System.out.printf("%1.010f",lits);
    else 
        System.out.printf("%1.010f",largest);


   } 
}

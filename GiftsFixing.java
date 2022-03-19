import java.util.Arrays;
import java.util.Scanner;

/**
 * GiftsFixing
 */
public class GiftsFixing {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            int n = iScanner.nextInt();
            long[] candies  = new long[n];
            long[] orange = new long[n];
            long[] can = new long[n];
            long[] ora = new long[n];
            for(int i = 0;i<n;i++){
            candies[i] = iScanner.nextLong();
            can[i] = candies[i];
            }
            for(int i = 0;i<n;i++){
                orange[i] = iScanner.nextLong();
                ora[i] = orange[i];
            }
            Arrays.sort(candies);
            Arrays.sort(orange);
            long minCandy = candies[0];
            long minOrange = orange[0];
            long count=0;
            for(int i=0;i<n;i++){
                while(minCandy<can[i] || minOrange<ora[i]){
                    if(can[i]>minCandy && ora[i]>minOrange){
                        long canStay = can[i] - minCandy;
                        long oraStay = ora[i] - minOrange;
                        if(oraStay<canStay){
                            count = count + oraStay;
                            count  = count + (canStay-oraStay);
                        }
                        else{
                            count  = count + canStay;
                            count = count + (oraStay-canStay);
                        }
                        can[i] = minCandy;
                        ora[i] = minOrange;
                    }
                    else if(can[i]>minCandy){
                        count  = can[i] - minCandy + count;
                        can[i] = minCandy;
                    }
                    else if(ora[i]>minOrange){
                        count = ora[i] - minOrange + count;
                        ora[i] = minOrange;
                    }
                }
            }
            System.out.println(count);
            test--;
        }
    }
}
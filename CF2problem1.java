import java.util.Arrays;
import java.util.Scanner;

public class CF2problem1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int len = iScanner.nextInt();
            long[] arr = new long[len];
            long[] arr2 = new long[len];
            for(int i=0;i<len;i++){
                arr[i] = iScanner.nextLong();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr);
            long low = arr[0];
            long high = arr[len-1];
            int findLow = -5;
            int findHigh = -5;
            for(int i=0;i<len;i++){
                if(low==arr2[i] && findLow==-5){
                    findLow = i+1;
                }
                if(high==arr2[i] && findHigh==-5){
                    findHigh = i+1;
                }
                if(findHigh!=-5 && findLow!=-5)
                break;
            }
            System.out.println(findLow +" "+ findHigh);
        }
    }
}

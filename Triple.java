import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int len = iScanner.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = iScanner.nextInt();
            }
            Arrays.sort(arr);
            int have = 1;
            for(int i=1;i<len;i++){
                if(arr[i]==arr[i-1]){
                    have++;
                }
                else
                have =1;

                if(have==3){
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(have<3){
                 System.out.println("-1");   
            }
        }
    }
}

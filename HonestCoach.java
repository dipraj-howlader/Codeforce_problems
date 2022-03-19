import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){

            int n = iScanner.nextInt();
            int[] num  =new int[n];
            for(int i=0;i<n;i++)
            num[i] = iScanner.nextInt();
            Arrays.sort(num);

            int mini =Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(num[i]-num[i-1]<mini){
                    mini = num[i]-num[i-1];
                }
            }
            System.out.println(mini);

            test--;
        }
    }
}

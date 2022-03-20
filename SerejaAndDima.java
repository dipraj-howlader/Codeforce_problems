import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int[] arr = new int[test];
        int sum = 0;
        for(int i=0;i<test;i++){
            arr[i] = iScanner.nextInt();
            sum  =sum+arr[i];
        }
        Arrays.sort(arr);
        int sum2 = 0;
        
            for(int i=0;i<test;i=i+2){
                sum2 = sum2 + arr[i];
            }
            int dima = 0;
            int sereja = 0;
        if(test%2==0){
            dima = sum2;
            sereja = sum-dima;
        }
        else{
            sereja = sum2;
            dima = sum - sereja;
        }
        System.out.println(sereja + " "+ dima);
    }
}

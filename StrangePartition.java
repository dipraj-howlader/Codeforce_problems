import java.util.Scanner;

public class StrangePartition {
   public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    int test = iScanner.nextInt();
    while(test>0){
        test--;
        int n = iScanner.nextInt();
        int x = iScanner.nextInt();
        long[] arr = new long[n];
        long sumTotal = 0;
        for(int i =0;i<n;i++){
            arr[i] = iScanner.nextLong();
            sumTotal = sumTotal + arr[i];
        }
        long sum =0;
        for(int i =0;i<n;i++){
            if(arr[i]%x!=0){
                sum = sum + (arr[i]/x)+1;
            }
            else
            sum = sum + arr[i] / x;
        }
        if(sumTotal%x!=0)
        sumTotal = sumTotal/x +1;
        else
        sumTotal = sumTotal/x;
        System.out.println(sumTotal +" "+sum);

    }
   } 
}

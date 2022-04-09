/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-09----21:18:30
 * @modify date 2022-04-09----21:18:30
 * @desc [description]
 */

import java.util.Scanner;

public class ArrayBalancing {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            long[] arr1 = new long[n*2];
            for(int i=0;i<n*2;i++)
            arr1[i] = iScanner.nextLong();
            for(int i=0;i<n;i++){
                if(arr1[i]>arr1[n+i])
                {
                    long temp = arr1[n+i];
                    arr1[n+i] = arr1[i];
                    arr1[i] = temp;
                }
            }
            // for (long l : arr1) {
            //     System.out.print(l+" ");
            // }
            long sum = 0;
            for(int i=1;i<n;i++){
                long red = arr1[i] - arr1[i-1];
                if(red<0)
                red = -1*red;
                sum = sum + red;
            }
            for(int i=n+1;i<n*2;i++){
                long red = arr1[i] - arr1[i-1];
                if(red<0)
                red = -1*red;
                sum = sum + red;
            }
            System.out.println(sum);
        }
    }
}

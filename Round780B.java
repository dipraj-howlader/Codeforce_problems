import java.util.Arrays;
import java.util.Scanner;

public class Round780B {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++)
            arr[i] = iScanner.nextLong();
            Arrays.sort(arr);

           if(n==1 && arr[0]>1)
           System.out.println("NO");
           else if(n==1 && arr[0]==1)
           System.out.println("YES");
           else if(arr[n-1]==arr[n-2] || arr[n-1]==arr[n-2]+1)
           System.out.println("YES");
           else
           System.out.println("NO");
        }
    }
}

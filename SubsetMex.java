import java.util.Arrays;
import java.util.Scanner;

public class SubsetMex {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int n = iScanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = iScanner.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[n - 1];
            int count = 0;
            int[] arr2 = new int[max+2];
            for (int i = 0; i < max+2; i++)
                arr2[i] = 0;
            if (min == 0) {
                for (int i = 0; i < n; i++)
                    arr2[arr[i]]++;

                int a = 0;
                int b = 0;
                for(int i = 0;i<max+2;i++){
                    if(arr2[i]==0){
                        a = i;
                        break;
                    } 
                    arr2[i] =arr2[i]-1;
                
                }
                for(int i = 0;i<max+2;i++){
                    if(arr2[i]==0){
                        b = i;
                        break;
                    }
                }
                System.out.println(a+b);
            }
            else
            System.out.println(0);
        }

    }
}

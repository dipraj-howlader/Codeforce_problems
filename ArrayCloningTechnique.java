import java.util.Arrays;
import java.util.Scanner;

public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = iScanner.nextInt();
            Arrays.sort(arr);
            int highestElement = MaxFrac(arr);
            System.out.println(highestElement);
        }
    }

    private static int MaxFrac(int[] arr) {
        int len = arr.length;
        int res = 0;
        int count = 1;
        int high = 0;
        for(int i=1;i<len;i++){
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            count--;

            if(count<=high){
                res = i;
                count = 1;
            }

        }
        return arr[res];
    }
}

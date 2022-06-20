import java.util.Scanner;

public class CubesSorting {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0)
        {
            test--;
            int n = iScanner.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextLong();
            }
            int one = 1;
            for(int i=1;i<n;i++){
                if(arr[i]>=arr[i-1])
                {
                    one = 0;
                    break;
                }
            }
            if(one==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

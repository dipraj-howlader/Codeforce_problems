import java.util.Scanner;

public class LinelandMail {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++)
        arr[i] = iScanner.nextLong();

        long longIndex1 = arr[0];
        long longIndex2 = arr[n-1];

        for(int i=0;i<n;i++){
        long small = 0;
        long large = 0;
            if(i==0){
                small = (long) Math.abs(arr[1]-arr[0]);
                large = (long) Math.abs(arr[n-1]-arr[0]);
            }
            else if(i+1 == n){
                small = (long) Math.abs(arr[n-1]-arr[n-2]);
                large = (long) Math.abs(arr[n-1]-arr[0]);
            }
            else{
                long l1 = (long) Math.abs(arr[i]-longIndex1);
                long l2 = (long) Math.abs(arr[i]-longIndex2);
                large = Long.max(l1, l2);
                long s1 = (long) Math.abs(arr[i]-arr[i-1]);
                long s2 = (long) Math.abs(arr[i]-arr[i+1]);
                small = Long.min(s1, s2);
            }
            System.out.print(small + " "+large);
            System.out.println();
        }
    }
}

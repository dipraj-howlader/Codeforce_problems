import java.util.Arrays;
import java.util.Scanner;

public class Round780B {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int t = iScanner.nextInt();
        while(t>0){
            t--;
            int sizes = iScanner.nextInt();
            long[] arr = new long[sizes];
            for(int i=0;i<sizes;i++)
            arr[i] = iScanner.nextLong();
            Arrays.sort(arr);

           if(sizes==1 && arr[0]>1)
           System.out.println("NO");
           else if(sizes==1 && arr[0]==1)
           System.out.println("YES");
           else if(arr[sizes-1]==arr[sizes-2] || arr[sizes-1]==arr[sizes-2]+1)
           System.out.println("YES");
           else
           System.out.println("NO");
        }
        iScanner.close();
    }
}

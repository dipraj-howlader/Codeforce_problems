import java.util.Scanner;

public class ShiftingStacks {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextLong();
            }
            int count = 0;
            long sum = 0;
            long follow = 0;
            for(int i=0;i<n;i++){
                sum = sum + arr[i];
                follow = follow + i;
                if(sum<follow){
                    count++;
                    break;
                }
            }
            if(count==0)
            System.out.println("YES");
            else
            System.out.println("NO");
            
        }
    }
}

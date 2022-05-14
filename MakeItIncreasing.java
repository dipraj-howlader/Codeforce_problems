import java.util.Scanner;

public class MakeItIncreasing {
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
            boolean isCount = true;
            int count = 0;
            for(int i=n-2;i>=0;i--){
                while(arr[i]>=arr[i+1]){
                    arr[i] = (long) Math.floor(arr[i]/2);
                    // long a = arr[i];
                    count++;
                    if(arr[i]==0 && arr[i+1]==0){
                    isCount = false;
                    break;
                    }
                }
                if(isCount==false){
                    break;
                }
            }
            if(isCount==false)
            System.out.println(-1);
            else{
                System.out.println(count);
            }
        }
    }
}

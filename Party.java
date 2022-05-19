import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] arr = new int[n+1];
        int min = 0;
        int count = 0;
        for(int i=1;i<=n;i++){
            arr[i] = iScanner.nextInt();
        }
        int lock = 0;
        for(int i =1;i<=n;i++){
            count = 0;
            lock = arr[i];
            while(lock!=-1){
                lock = arr[lock];
                count++;
            }
            min = Integer.max(count, min);
        }
        System.out.println(min+1);
        // for(int i=0;i<n;i++){
        //     if(arr[i]==-1){
        //         index = i+1;
        //     }
        //     if(arr[i]==index)
        //     {       
        //         count++;
        //         index++;
        //         if(count>min){
        //         min = count;
        //         }
        //     }
        //     else{
        //         count = count +2;
        //         index = arr[i];
        //     }
        
    }
}

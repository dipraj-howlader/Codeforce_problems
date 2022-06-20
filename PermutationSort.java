import java.util.Scanner;

public class PermutationSort {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextInt();
            }
            boolean check = true;
            if(arr[0]==1)
            check = false;
            if(arr[arr.length-1] == arr.length)
            check = false;
            boolean dobleCheck = true;
            boolean isReverse = true;
            if(arr[0] == n && arr[n-1]==1)
            isReverse = false;
            for(int i=1;i<=n;i++){ 
                if(arr[i-1]!=i)
                dobleCheck = false;
            }
            if(dobleCheck==true)
            System.out.println(0);
            else if(isReverse==false)
            System.out.println(3);
            else if(dobleCheck==false && check == false)
            System.out.println(1);
            else
            System.out.println(2);
        }
    }
}

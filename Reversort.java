import java.util.Scanner;

public class Reversort {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int indexOfmin = -1;
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextInt();
                if(arr[i]<min){
                min = arr[i];
                indexOfmin = i;}
                if(indexOfmin+1==n)
                    {
                        System.out.println(indexOfmin+1+n-2);
                    }
                else{
                    
                }
                    
                }

            }


        }
    }
}

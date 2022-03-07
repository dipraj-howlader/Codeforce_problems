import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int i =1;i<=test;i++){
            int n = iScanner.nextInt();
            int[] numbers = new int[n];
            int sum = 0;
            if((n/2)%2!=0){
                System.out.println("NO");
            }
            else{

                for(int j=2,k=0;k<n/2;k++){
                    numbers[k] = j;
                    sum = sum + j;
                    j = j+2;
                }
                int sum2 = 0;
                for(int j = n/2,k=1; j<n-2;j++){

                    numbers[j] = k;
                    sum2 =sum2+k;
                    k=k+2;
                }
                sum = sum - sum2;
                int first = sum /2;
                if(first%2==0){
                    numbers[n-2] = first-1;
                    numbers[n-1] = first+1;
                }
                else {
                    numbers[n-2] = first-2;
                    numbers[n-1] = first+2;
                }
                System.out.println("YES");
                for (int j : numbers) {
                    System.out.print(j+ " ");
                }
                System.out.println();
                sum =0;
                sum2 = 0;
            }
        }
    }
}

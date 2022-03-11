import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int i =1;i<=test;i++){
            long n = iScanner.nextLong();
            int k=2;
            long x=0;
            long stay=1;
            while(stay!=0){
                double sum = (Math.pow(2, k))-1;
                int intsum = (int) sum;
                stay=n%intsum;
                if(stay==0)
                {
                    x = n/intsum;
                    break;
                }
                k++;
            }
            System.out.println(x);
            
        }
    }
}

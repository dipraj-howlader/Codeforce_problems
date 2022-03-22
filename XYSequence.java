import java.util.Scanner;

public class XYSequence {
    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long n= iScanner.nextLong();
            long b = iScanner.nextLong();
            long x = iScanner.nextLong();
            long y = iScanner.nextLong();
            long sum1  = 0;
            long inti = 0;
            // long[] sum = new long[(int) n+1];
            long s =0;
            for(int i=1;i<=n;i++){
                if(inti+x<=b){
                    // sum = sum + inti;
                    inti = inti+x;
                    // sum[i-1] = inti;
                    // s= sum[i-1];
                    sum1 = inti +sum1;
                }
                else{
                    inti = inti-y;
                    // sum[i-1] = inti;
                    // s = sum[i-1];
                    sum1 = inti+sum1;
                }
            }
            System.out.println(sum1);
        }
    }
}

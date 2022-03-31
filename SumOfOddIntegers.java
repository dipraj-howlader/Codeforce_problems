import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        long test = iScanner.nextLong();
        while(test>0){
            test--;
            long sum = iScanner.nextLong();
            long num = iScanner.nextLong();
            if(sum%2==0){
                if(num*num>sum)
                System.out.println("NO");
                else{
                if(num%2==0)
                System.out.println("YES");
                else
                System.out.println("NO");
                }
            }
            else{
                if(num*num>sum)
                System.out.println("NO");
                else{
                if(num%2!=0)
                System.out.println("YES");
                else
                System.out.println("NO");
                }
            }
        }
    }
}

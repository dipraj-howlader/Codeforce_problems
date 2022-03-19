import java.util.Scanner;

public class LocustLocus {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int sum =0;
        int max = 1000000;
        while(test!=0){
            int year = iScanner.nextInt();
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            sum = year + (a*b);
            if(sum <max){
                max = sum;
            }
            test --;
        }
        System.out.println(max);
    }
}

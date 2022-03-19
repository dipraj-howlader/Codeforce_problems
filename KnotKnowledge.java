import java.util.Arrays;
import java.util.Scanner;

public class KnotKnowledge {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int[] num1 = new int[test];
        int[] num2 = new int[test-1];
        int sum =0;
        int sum1 = 0;
        for(int i =0;i<test;i++){
            num1[i] = iScanner.nextInt();
            sum = sum + num1[i];
        }
        for(int i=0;i<test-1;i++){
            num2[i]= iScanner.nextInt();
            sum1 = sum1+num2[i];
        }
        System.out.println(sum-sum1);
    }
}

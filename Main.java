import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int j =1;j<=test;j++){
            int n = iScanner.nextInt();
            int[] number = new int[n];
            for(int i =0;i<n;i++){
                number[i] = iScanner.nextInt();
            }
            Arrays.sort(number);
            System.out.println(number[n-1] - number[0]);
        }
    }
}

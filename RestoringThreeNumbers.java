import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner isScanner = new Scanner(System.in);
        int[] sums = new int[4];
        for(int i=0;i<4;i++){
            sums[i] = isScanner.nextInt();
        }
        Arrays.sort(sums);
        int c = sums[3]-sums[0];
        int a = sums[1] - c;
        int b = sums[2] - c;
        System.out.print(a +" " +b + " "+c);

    }
}

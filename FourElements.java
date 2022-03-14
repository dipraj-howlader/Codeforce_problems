import java.util.Arrays;
import java.util.Scanner;

public class FourElements {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        long[] numbers = new long[5];
        for(int i=0;i<5;i++){
            numbers[i] = iScanner.nextLong();
        }
        Arrays.sort(numbers);
        long sumMin  = numbers[0]+numbers[1]+numbers[2]+numbers[3];
        long sumMax = numbers[4]+numbers[1]+numbers[2]+numbers[3];
        System.out.println(sumMin + " " + sumMax);
    }
}

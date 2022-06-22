import java.util.Scanner;

public class HackkerankContest1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        long n = iScanner.nextLong();
        int max = 0;
        long mul = 1;
        while (n > 0) {
            long last = n % 10;
            if (max < last)
                max = (int) last;
            mul = mul * fact(last);
            n = n / 10;

        }
        long factSum = mul;
        if (max % 2 == 0)
            max = max - 1;
        int[] arr = new int[max + 1];
        for (int i = 2; mul > 1;) {
            if (mul % i == 0) {
                arr[i]++;
                mul = mul / i;
            } else
                i++;
        }
        // for (int i : arr) {
        // System.out.println(i +" ");
        // }
        String s = "";
        long sumLong = 1;
        for (int i = arr.length - 1; i > 2; i = i - 2) {
            int var = arr[i];
            for (int j = 0; j < var; j++)
                s = s + String.valueOf(i);
            for (int j = i; j > 2; j = j - 2) {
                arr[j] = arr[j] - var;
            }
            long factor = fact(i);
            sumLong = sumLong * (long) Math.pow(factor, var);
        }
        long timeOfTwo = factSum / sumLong;
        timeOfTwo = log2(timeOfTwo);
        for (int i = 0; i < timeOfTwo; i++)
            s = s + String.valueOf(2);
        System.out.println(s);
    }

    private static long fact(long n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static long log2(long N) {
        long result = (long) (Math.log(N) / Math.log(2));

        return result;
    }
}

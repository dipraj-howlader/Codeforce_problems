import java.util.Arrays;
import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int totalShop = iScanner.nextInt();
        long lunchTime = iScanner.nextLong();
        long[][] restu = new long[totalShop][2];

        for (int i = 0; i < restu.length; i++) {
            for (int j = 0; j < restu[i].length; j++)
                restu[i][j] = iScanner.nextLong();
        }
        long[] min = new long[totalShop];
        for (int i = 0; i < totalShop; i++) {
            // do minus of the elements
            long resEveryLunch = restu[i][1];
            if(resEveryLunch<=lunchTime)
            min[i] = restu[i][0];
            else
            min[i] = restu[i][0] - (resEveryLunch-lunchTime);
        }
        Arrays.sort(min);
        int arrlength = min.length;
        System.out.println(min[arrlength-1]);
    }
}

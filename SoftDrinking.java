import java.util.Scanner;

/**
 * SoftDrinking
 */
public class SoftDrinking {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] soft = new int[8];
        for(int i=0;i<8;i++){
            soft[i] = iScanner.nextInt();
        }
        int enoughDrinks = soft[1]*soft[2] / soft[6];
        int enoughLimes = soft[3]*soft[4];
        int enoughSalt = soft[5] / soft[7];
        int min1 = Integer.min(enoughDrinks, enoughLimes);
        int min2 = Integer.min(enoughLimes, enoughSalt);
        int minimum = Integer.min(min1, min2);
        System.out.println(minimum/soft[0]);
    }
}
import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner iScanner  = new Scanner(System.in);
        int red = iScanner.nextInt();
        int blue = iScanner.nextInt();
        int diffPair = Integer.min(red, blue);
        int samePair = (Integer.max(red, blue) - diffPair)/2;
        System.out.println(diffPair + " " + samePair);
    }
}

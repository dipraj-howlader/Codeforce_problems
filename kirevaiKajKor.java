import java.util.Scanner;

public class kirevaiKajKor {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        double value = Math.pow(number, 3);
        System.out.println((int)value);
    }
}

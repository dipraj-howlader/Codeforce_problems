import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int sum = 0;
        int large = 0;
        for(int i = 1;i<=n;i++ ){
            int number = iScanner.nextInt();
            sum = sum + number;
            if(large<number)
                large = number;
        }
        int needTreasure = large*n - sum;
        System.out.println(needTreasure);
    }
}

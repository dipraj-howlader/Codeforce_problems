import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        for(int i=1;i<=n;i++){
            int x =iScanner.nextInt();
            int y = iScanner.nextInt();
            int min = Integer.min(x, y);
            int max = Integer.max(x, y);
            int rest = max -min;
            int tenHave = rest /10;
            if(rest%10!=0)
            tenHave = tenHave+1;
            System.out.println(tenHave);

        }
    }
}

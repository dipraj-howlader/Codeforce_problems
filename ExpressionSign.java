import java.util.Scanner;

public class ExpressionSign {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        int b = iScanner.nextInt();
        double s = Math.pow(a, b);
        if(s<0)
        System.out.println(-1);
        else if(s==0)
        System.out.println(0);
        else 
        System.out.println(1);
    }
}

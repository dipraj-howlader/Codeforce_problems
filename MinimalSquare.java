import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test!=0){
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            if(a>b)
            {
                int temp = a;
                a = b;
                b = temp;
            }
            System.out.println(Math.max(a*2, b)*Math.max(a*2, b));
            test--;
        }
    }
}

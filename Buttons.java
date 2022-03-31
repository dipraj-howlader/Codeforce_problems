import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int sum = 0;
        for(int i=1,j=n-1;i<n;i++,j--){
            sum = sum + (i*j);
        }
        sum = sum + n;
        System.out.println(sum);
    }
}

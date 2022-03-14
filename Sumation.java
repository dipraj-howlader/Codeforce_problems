import java.util.Scanner;

public class Sumation {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int i=1;i<=test;i++){
            for(int j = test-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

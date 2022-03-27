import java.util.Scanner;

/**
 * AntiLight'sCellGuessing
 */
public class AntiLightSCellGuessing {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b= iScanner.nextLong();
            if(b==a && a==1){
                System.out.println(0);
            }
            else if(Long.min(a, b)==1)
            System.out.println(1);
            else
            System.out.println(2);
        }
    }
}
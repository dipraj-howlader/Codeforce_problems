import java.util.Scanner;
 
public class MadokaAndMathDad {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = iScanner.nextInt();
            int j = 2;
            int oneCount = 0;
            int twoCount = 0;
            if (n == 1)
                System.out.println(1);
            else {
                while (n != 0) {
                    n = n - j;
                    if (j == 2) {
                        twoCount++;
                        j = 1;
                    } else {
                        oneCount++;
                        j = 2;
                    }
                    if (n == 1) {
                        oneCount++;
                        break;
                    }
                }
                if(twoCount<oneCount)
                {
                    for(int x =1;x<=twoCount+oneCount;x++){
                        if(x%2!=0)
                        System.out.print(1);
                        else 
                        System.out.print(2);
                    }
                }
                else{
                    for(int x =1;x<=twoCount+oneCount;x++){
                        if(x%2!=0)
                        System.out.print(2);
                        else 
                        System.out.print(1);
                    } 
                }
 
                System.out.println();
            }
        }
    }
}
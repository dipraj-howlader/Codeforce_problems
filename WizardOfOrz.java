import java.util.Scanner;

public class WizardOfOrz {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0)
        {
            test--;
            int n = iScanner.nextInt();
            if(n==1)
            System.out.println(9);
            else if(n==2)
            System.out.println(98);
            else if(n==3)
            System.out.println(989);
            else{
                System.out.print(989);
                int mining = 0;
                n=n-3;
                for(int i=0;i<n;i++){
                    System.out.print(mining);
                    mining++;
                    if(mining==10)
                    mining=0;
                }
                System.out.println();
            }
        }
        iScanner.close();
    }
}

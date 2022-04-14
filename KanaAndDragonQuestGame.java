import java.util.Scanner;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            int c = iScanner.nextInt();
            int totalLS = c*10;
            if(a<=totalLS){
                System.out.println("YES");
            }
            else{
                int finish = 0;
                while(b!=0){
                    a = (int) Math.floor(a/2)+10;
                    b--;
                    if(a<=totalLS){
                        finish=1;
                        break;
                    }
                }
                if(finish==0)
                System.out.println("NO");
                else
                System.out.println("YES");
            }
        }
        iScanner.close();
    }
}

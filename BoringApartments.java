import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0)
        {
            int number = iScanner.nextInt();
            int len = String.valueOf(number).length();
            int div = number%10;
            int res = (div-1)*10;
            if(len==1){
                res = res + 1;
            }
            else if(len==2){
                res = res +3;
            }
            else if(len==3)
            res = res + 6;
            else 
            res = res +10;
            System.out.println(res);
            test--;
        }
    }
}

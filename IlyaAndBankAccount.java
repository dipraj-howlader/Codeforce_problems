import java.util.Scanner;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        if(n>0){
            System.out.println(n);
        }
        else{
            int number = -1*n;
            int length = String.valueOf(number).length();
            int firstStay = number%10;
            int secStay = number%100;
            secStay = secStay-firstStay;
            secStay = secStay/10;
            number = number/100;
            int lastAdd = Integer.min(firstStay, secStay);
            String firstPart = String.valueOf(number);
            String secPart = String.valueOf(lastAdd);
            if(number==0){
                System.out.println(-1*lastAdd);
            }
            else{
                System.out.println("-"+firstPart+secPart);
            }

        }
    }
}

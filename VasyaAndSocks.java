import java.util.Scanner;

public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n =iScanner.nextInt();
        int m =iScanner.nextInt();
        if(n/m<1)
        System.out.println(n);
        else{
            int days = n;
            int count=0;
            while(days>0){
                days--;
                count++;
                if(count%m==0){
                    days++;
                }

            }
            System.out.println(count);
        }
    }
}

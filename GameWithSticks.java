import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int m = iScanner.nextInt();
        int count=0;
        while(n>0 && m>0){
            n=n-1;
            m=m-1;
            count++;

        }
        if(count%2!=0)
        System.out.println("Akshat");
        else
        System.out.println("Malvika");
    }
}

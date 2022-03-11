import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int count = 0;
        for(int i=1;i<=test;i++){
            int mishka = iScanner.nextInt();
            int chris = iScanner.nextInt();
            if(mishka>chris)
            count++;
            else if(mishka<chris)
            count --;
        }
        if(count ==0)
        System.out.println("Friendship is magic!^^");
        else if(count<0)
        System.out.println("Chris");
        else if(count>0)
        System.out.println("Mishka");
    }
}

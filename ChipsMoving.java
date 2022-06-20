import java.util.Scanner;

public class ChipsMoving {
    public static void main(String[] args) {
        Scanner iScanner  = new Scanner(System.in);
        int test = iScanner.nextInt();
        long odd = 0;
        long even = 0;
        for(int i=0;i<test;i++){
            long take = iScanner.nextLong();
            if(take%2==0)
            even++;
            else
            odd++;
        }
        if(even>odd)
        System.out.println(odd);
        else
        System.out.println(even);
    }
}

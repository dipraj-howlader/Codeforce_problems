import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
        int x = iScanner.nextInt();
        int y = iScanner.nextInt();
        if(x==0 && y==0)
        System.out.println(0);
        else{
            int  m = (int)Math.pow((0-x), 2) +(int) Math.pow((0-y), 2);
            int a =(int) Math.sqrt(m);
            if((a*a)==m)
            System.out.println(1);
            else
            System.out.println(2);
        }
        }

    }
}

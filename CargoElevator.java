import java.util.Scanner;

public class CargoElevator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int count100 = 0;
        int count50 = 0;
        for(int i=0;i<n;i++)
        {
            int a =iScanner.nextInt();
            if(a==50)
            count50++;
            else 
            count100++;
        }
        int total = 0;
        if(count50==0)
        System.out.println(count100);
        else if(count100==0)
        System.out.println((int)Math.ceil(count50/3.00));
        else{
            int min50=0;
            int min100 = 0;
            if(count100==count50){
            System.out.println(count100);       
        }
            else if(count100<count50)
            min100=-1;
            else
            min50= -1;
        }
    }
}

import java.util.Scanner;

public class HitTheLottery {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       long n = iScanner.nextInt();
       int count=0;
       for(long i=n;i!=0;){
        if(i>=100)
            i=i-100;
        else if(i<100 && i>=20)
            i=i-20;
        else if(i<20 && i>=10)
            i=i-10;
        else if(i<10 && i>=5)
            i=i-5;
        else
            i=i-1;
            count++;
       }
       System.out.println(count);
   } 
}

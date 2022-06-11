import java.util.Scanner;
public class AlarmClock{
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = iScanner.nextLong();
            long d = iScanner.nextLong();
            if(b>=a){
                System.out.println(b);
            }
            else{
                if(d>=c)
                System.out.println("-1");
                else{
                    long rest = a - b;
                    long restAlarm = c - d;
                    long totalRest = 0;
                    if(rest%restAlarm!=0)
                    totalRest = (rest / restAlarm) + 1;
                    else
                    totalRest = rest / restAlarm;
                    System.out.println(b + totalRest * c);
                }
            }
        }
    }
}
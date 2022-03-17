import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int t = iScanner.nextInt();
        int k = iScanner.nextInt();
        int d = iScanner.nextInt();
        double a = (double)n/k;
        int ovenUsed =(int) Math.ceil(a);
        if(ovenUsed<=1)
        System.out.println("NO");
        else{
            int maxTime = ovenUsed*t;
            int intiTime = 0;
            int timeCount = 0;
            while(n>0){
                if(intiTime<d)
                {
                    n = n -k;
                    intiTime=intiTime+t;
                    timeCount=timeCount+t;
                    ovenUsed--;
                    if(ovenUsed<=0)
                    break;
                    if(intiTime>=d)
                    timeCount = timeCount - (timeCount-d);
                }
                else{
                   timeCount = timeCount+t;
                   ovenUsed=ovenUsed-2;
                   if(ovenUsed<=0)
                   break;

                }
            }
            if(timeCount<maxTime)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

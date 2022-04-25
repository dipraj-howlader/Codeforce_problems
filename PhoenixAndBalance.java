import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test --;
            int n = iScanner.nextInt();
            int suma = 0;
            int sumb = 0;
            for(int i=1;i<=n;i=i+2){
                int a = (int) Math.pow(2, i);
                int b = (int) Math.pow(2, i+1);
                if(suma<sumb){
                suma = suma + b;
                sumb = sumb + a;
                }
                else
                {
                suma = suma + a;
                sumb = sumb + b;
                }
            }
            int dis = (int)Math.abs(suma-sumb);
            System.out.println(dis);
        }
    }
}

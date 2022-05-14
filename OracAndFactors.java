import java.util.Scanner;

public class OracAndFactors {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int k = iScanner.nextInt();
            if(n%2==0){
                System.out.println(n+(k*2));
            }
            else{
                int ret = check(n);
                if(ret==1)
                {
                    n = n + n;
                    k--;
                    System.out.println(n+(k*2));
                }
                else{
                    n = n + ret;
                    k--;
                    System.out.println(n+(k*2));
                }
            }
        }
    }

    private static int check(int n) {
        for(int i=3;i*i<=n;i++){
            if(n%i==0)
            return i;
        }
        return 1;
    }
}

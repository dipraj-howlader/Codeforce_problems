import java.util.Scanner;

public class YetAnotherTetrisProblem {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int odd = 0;
            int even = 0;
            for(int i=0;i<n;i++){
                int take = iScanner.nextInt();
                if(take%2==0)
                odd=1;
                else{
                    even = 1;
                }
            }
            if(odd==0 || even==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

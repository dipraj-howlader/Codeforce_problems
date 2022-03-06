import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n =iScanner.nextInt();
        int even= 0;
        int odd = 0;
        for(int j=1;j<=n;j++){
            int t= iScanner.nextInt();
            for(int i=0;i<t;i++){
             int test = iScanner.nextInt();
             if(i%2==0){
                 if(test%2!=0){
                     even++;
                 }
             }
             else if(i%2!=0){
                if(test%2==0){
                    odd++;
                }
             }


            }
            if(odd == even){
                System.out.println(odd);
            }
            else
            System.out.println(-1);
            odd = even=0;
        }
    }
}

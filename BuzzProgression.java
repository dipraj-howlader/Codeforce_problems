import java.util.Scanner;

public class BuzzProgression {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();
        int n = iScanner.nextInt();
        int sum =0;
        sum = sum + x;
        for(int i =2;i<=n;i++){

            if(i%5==0){
                x=x-2;
            }
            else 
            x = x+1;
            sum+=x;
        }
        System.out.println(sum);
    }
}

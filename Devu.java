import java.util.Scanner;

public class Devu {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int d = iScanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = iScanner.nextInt();
            sum = sum + arr[i];
        }
        int count = 0;
        int bol =0;
        int happen = sum + 10*(n-1);
        if(happen>d)
        bol=1;
        else{
            d = d - happen;
            count = (n-1)*2;
            count = count + d/5;
        }

        if(bol==1)
        System.out.println(-1);
        else
        System.out.println(count);


    }
}

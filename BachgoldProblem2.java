import java.util.Scanner;

public class BachgoldProblem2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        if(n%2==0){
            n=n/2;
            System.out.println(n);
        }
        else{
            n = n/2;
            n--;
            System.out.println(n+1);
            System.out.print(3 + " ");
        }
        for(int i=0;i<n;i++){
            System.out.print(2 +" ");
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class DisplayTheNumber {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int  n = iScanner.nextInt();
            if(n%2==0){
                int a = n/2;
                for(int i=0;i<a;i++){
                    System.out.print('1');
                }
                System.out.println();
            }
            else if(n==3)
            System.out.println(7);
            else{
                int a = n/2;
                System.out.print(7);
                for(int i=0;i<a-1;i++){
                    System.out.print(1);
                }
                System.out.println();
            }
        }
    }
}

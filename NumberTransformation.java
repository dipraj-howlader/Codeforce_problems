import java.util.Scanner;

public class NumberTransformation {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();

            if(b%a!=0){
                System.out.println(0+" "+0);
            }
            else if(a==b)
            System.out.println(1 +" "+1);
            else{
                int mainvalue = b/a;
                System.out.println(1+" "+mainvalue);
            }
        }
    }
}

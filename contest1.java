import java.util.Scanner;

public class contest1 {

        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            int n = iScanner.nextInt();
            while(n>0){
                n--;
                int l1 = iScanner.nextInt();
                int r1 = iScanner.nextInt();
                int l2 = iScanner.nextInt();
                int r2 = iScanner.nextInt();
                if(l1>=l2 && l1<=r2)
                System.out.println(l1);
                else if(l2>=l1 && l2<=r1)
                System.out.println(l2);
                else
                System.out.println(l1+l2);

            }
        }
    }

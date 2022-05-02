import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            String str = iScanner.next();
            char c1 = str.charAt(0);
            char c2 = str.charAt(1);
            int res1 = (c1-96-1);
            int res2 = (c2-96-1);
            if(res1<res2)
            System.out.println(res1*25+res2);
            else
            System.out.println(res1*25+res2 + 1);
        }
    }
}

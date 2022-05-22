import java.util.Scanner;

/**
 * Contest793A
 */
public class Contest793 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int n = iScanner.nextInt();
            String str = iScanner.next();
            String strOne = str.replaceAll(String.valueOf(str.charAt(0)), "");
            if (strOne.length() == 0)
                System.out.println(n);
            else {
                int index = n / 2;
                char ch = str.charAt(index);
                int count = 0;
                int i = index;
                while (ch == str.charAt(i - 1)) {
                    count++;
                    i--;
                    if (i == 0)
                        break;
                }
                i = index;
                while (ch == str.charAt(i + 1)) {
                    count++;
                    i++;
                    if (i == n - 1)
                        break;
                }
                System.out.println(count + 1);
            }
        }
    }
}
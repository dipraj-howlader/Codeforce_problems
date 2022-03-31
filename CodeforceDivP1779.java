import java.util.Scanner;

public class CodeforceDivP1779 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int n = iScanner.nextInt();
            String str = iScanner.next();
            int count = 0;
            for (int i = 0; i < n; i++) {
                    if (str.charAt(i) == '1' && i != 0 && i != n - 1) {
                        if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0')
                            count++;
                    } else if (str.charAt(i) == '0' && i!=n-1) {
                        if (str.charAt(i + 1) == '0')
                            count = count + 2;

                    
                }

            }
            System.out.println(count);
        }
    }
}

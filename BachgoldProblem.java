import java.util.Scanner;

/**
 * BachgoldProblem
 */
public class BachgoldProblem {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        boolean[] prime = new boolean[n + 1];
        if (n == 2) {
            System.out.println(1);
            System.out.println(2);
        } else {
            for (int i = 2; i < n; i++)
                prime[i] = true;

            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == true) {
                    for (int j = i * i; j <= n; j = j + i) {
                        prime[j] = false;
                    }
                }
            }
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (prime[i] == true)
                    count++;
            }
            System.out.println(count);
            if (n % count == 0) {
                for (int i = 1; i <= count; i++)
                    System.out.print(n / count + " ");
            } else {
                int min = n / count;
                int max = min + 1;
                int take = count;
                for (int i = 1; i <= count; i++) {
                    if (n % take != 0) {
                        System.out.print(min + " ");
                        n = n - min;
                        take--;
                    } else {
                        System.out.print(max + " ");
                        n = n - max;
                        take--;
                    }

                }
            }
        }
    }
}
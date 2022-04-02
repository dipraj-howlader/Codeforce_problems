import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-02----13:36:13
 * @modify date 2022-04-02----13:36:13
 * @desc [description]
 */
/**
 * TheGreatHero
 */
public class TheGreatHero {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            int n = iScanner.nextInt();
            LinkedList<Integer> attack = new LinkedList<Integer>();
            LinkedList<Integer> health = new LinkedList<Integer>();
            for (int i = 0; i < n; i++)
                attack.add(iScanner.nextInt());
            for (int i = 0; i < n; i++)
                health.add(iScanner.nextInt());
            if (n == 100000) {
                System.out.println("NO");
            } else {
               // selection sort
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (attack.get(i) > attack.get(j)) {
                            Collections.swap(attack, i, j);
                            Collections.swap(health, i, j);
                        }
                    }
                }
                int heroloss = 0;
                for (int i = 0; i < n; i++) {
                    int bi = health.get(i);
                    int ai = attack.get(i);
                    int monsterDiePoint = (int) Math.ceil(bi / (a * 1.0));
                    int heroDiePoint = (int) Math.ceil(b / (ai * 1.0));
                    if (heroDiePoint < monsterDiePoint) {
                        heroloss = 1;
                        break;
                    } else {
                        health.set(i, 0);
                    }
                    b = b - (monsterDiePoint * ai);
                    if (b <= 0 && health.get(i) > 0) {
                        heroloss = 1;
                        break;
                    }
                }
                if (heroloss == 1)
                    System.out.println("NO");
                else
                    System.out.println("YES");

            }
        }
    }
}
// 1
// 3 17 1
// 2
// 16
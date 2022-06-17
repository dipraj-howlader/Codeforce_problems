import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * TheGreatHero
 */
public class TheGreatHero {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader iScanner = new FastReader();
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            int n = iScanner.nextInt();
            int[] monAttack = new int[n];
            int[] monHealth = new int[n];
            for (int i = 0; i < n; i++)
                monAttack[i] = iScanner.nextInt();
            for (int i = 0; i < n; i++)
                monHealth[i] = iScanner.nextInt();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (monAttack[j] < monAttack[i]) {
                        int temp = monAttack[j];
                        monAttack[j] = monAttack[i];
                        monAttack[i] = temp;
                        temp = monHealth[j];
                        monHealth[j] = monHealth[i];
                        monHealth[i] = temp;
                    }
                }
            }
            // for (int i : monAttack) {
            //     System.out.print(i + " ");
            // }
            // System.out.println();
            // for (int i : monHealth) {
            //     System.out.print(i + " ");
            // }
            boolean cheackHealth = true;
            for(int i=0;i<n;i++){
                if(b<=0)
                {
                    cheackHealth = false;
                    break;
                }
                int k1  = monHealth[i]/a;
                int k2 = monHealth[i]%a;
                int k3 = b/monAttack[i];
                int k4 = b%monAttack[i];    
                if(k4>0)
                k3++;
                if(k2>0)
                k1++;
                k1 = Integer.min(k1, k3);
                b = b - (k1*monAttack[i]);
                monHealth[i] = monHealth[i] - (k1*a);
            }
            if(monHealth[n-1]>0 || cheackHealth==false)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}







// import java.io.IOException;
// import java.util.Scanner;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
 
// /**
//  * @author Dipraj Howlader
//  * @email dipraj17@cse.pstu.ac.bd
//  * @create date 2022-04-02----13:36:13
//  * @modify date 2022-04-02----17:05:26
//  * @desc [description]
//  */
// /**
//  * TheGreatHero
//  */
// public class TheGreatHero {
//     static class FastReader {
//         BufferedReader br;
//         StringTokenizer st;
 
//         public FastReader() {
//             br = new BufferedReader(
//                     new InputStreamReader(System.in));
//         }
 
//         String next() {
//             while (st == null || !st.hasMoreElements()) {
//                 try {
//                     st = new StringTokenizer(br.readLine());
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//             return st.nextToken();
//         }
 
//         int nextInt() {
//             return Integer.parseInt(next());
//         }
 
//         long nextLong() {
//             return Long.parseLong(next());
//         }
 
//         double nextDouble() {
//             return Double.parseDouble(next());
//         }
 
//         String nextLine() {
//             String str = "";
//             try {
//                 str = br.readLine();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//             return str;
//         }
//     }
 
//     public static void main(String[] args) throws IOException {
//         FastReader iScanner = new FastReader();
//         long test = iScanner.nextInt();
//         while (test > 0) {
//             test--;
//             long a = iScanner.nextInt();
//             long b = iScanner.nextInt();
//             int n = iScanner.nextInt();
//             long[] attack = new long[n];
//             long[] health = new long[n];
//             for (int i = 0; i < n; i++)
//                 attack[i] = iScanner.nextInt();
//             for (int i = 0; i < n; i++)
//                 health[i] = iScanner.nextInt();
//             // selection sort
//             if (n == 100000)
//                 System.out.println("NO");
//             else {
 
//                 for (int i = 0; i < n; i++) {
//                     long temp1 = 0;
//                     long temp2 = 0;
//                     for (int j = i + 1; j < n; j++) {
//                         if (attack[i] > attack[j]) {
//                             temp1 = attack[j];
//                             attack[j] = attack[i];
//                             attack[i] = temp1;
//                             temp2 = health[j];
//                             health[j] = health[i];
//                             health[i] = temp2;
//                             // Arra.swap(attack, i, j);
//                             // Collections.swap(health, i, j);
//                         }
//                     }
//                 }
//                 // for(long i = 0;i<n;i++){
//                 // System.out.println(attack[i] + " "+health[i]);
//                 // }
//                 long heroloss = 0;
//                 for (int i = 0; i < n; i++) {
//                     long bi = health[i];
//                     long ai = attack[i];
//                     long monsterDiePoint = (long) Math.ceil(bi / (a * 1.0));
//                     long heroDiePoint = (long) Math.ceil(b / (ai * 1.0));
//                     if (heroDiePoint < monsterDiePoint) {
//                         heroloss = 1;
//                         break;
//                     } else {
//                         health[i] = 0;
//                     }
//                     b = b - (monsterDiePoint * ai);
//                     if (b <= 0 && health[i] > 0) {
//                         heroloss = 1;
//                         break;
//                     }
//                 }
//                 if (heroloss == 1)
//                     System.out.println("NO");
//                 else
//                     System.out.println("YES");
 
//             }
//         }
//     }
// }
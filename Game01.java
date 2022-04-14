/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-14----11:30:38
 * @modify date 2022-04-14----11:30:38
 * @desc [description]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game01 {
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
        while(test>0){
            test--;
            String bString = iScanner.nextLine();
            int count0=0;
            int count1 = 0;
            for(int i=0;i<bString.length();i++){
                if(bString.charAt(i)=='0')
                count0++;
            }
            count1 = bString.length()-count0;
            int min = Integer.min(count0, count1);
            if(min%2==0)
            System.out.println("NET");
            else
            System.out.println("DA");

        }

    }
}

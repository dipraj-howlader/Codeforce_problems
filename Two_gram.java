/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-14----10:38:31
 * @modify date 2022-04-14----10:38:31
 * @desc [description]
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Two_gram {
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
        int len = iScanner.nextInt();
        String str = iScanner.nextLine();
        String strCopy = str;
        int highest = 0;
        String finString ="";
        for(int i=0;i<len-1;i++){
            String sub = strCopy.substring(i, i+2);
            int count = 0;
            for(int j=0;j<len-1;j++){
                String sub1 = str.substring(j, j+2);
                if(sub.equals(sub1)==true){
                    count++;
                }
            }
            if(count>highest){
                highest = count;
                finString =sub;
            }
        }
        System.out.println(finString);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProfSlim {
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
            int n = iScanner.nextInt();
            long[] arr = new long[n];
            int positive =0;
            int negative = 0;
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextLong();
                if(arr[i]<0){
                    negative++;
                    arr[i] = -1*arr[i];
                }
                else{
                    positive++;
                }
            }
            boolean yes = true;
            for(int i=0;i<negative;i++){
                arr[i] = -1*arr[i];
            }
            for(int i=1;i<n;i++){
                if(arr[i-1]>arr[i])
                {
                    yes = false;
                    break;
                }
            }
            if(yes)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

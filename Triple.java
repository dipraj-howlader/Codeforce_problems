import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Triple {
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
            int len = iScanner.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = iScanner.nextInt();
            }
            Arrays.sort(arr);
            int have = 1;
            for(int i=1;i<len;i++){
                if(arr[i]==arr[i-1]){
                    have++;
                }
                else
                have =1;

                if(have==3){
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(have<3){
                 System.out.println("-1");   
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsecutivePointsSegment {
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
        FastReader iString  = new FastReader();
        int test = iString.nextInt();
        while(test>0){
            test--;
            int n = iString.nextInt();
            int[] arr = new int[n];
            int[] arrdif = new int[n-1];
            for(int i=0;i<n;i++){
                arr[i] = iString.nextInt();
                if(i>0){
                    arrdif[i-1] = arr[i]-arr[i-1];
                }
            }
            int count2=0;
            int count3=0;
            int countMore = 0;
            int reverse = 0;
            for(int i=0;i<n-1;i++){
                if(arrdif[i]==2){
                    count2++;
                }
                else if(arrdif[i]==3)
                count3++;
                else if(arrdif[i]>3)
                countMore++;
             
                if(countMore>0)
                {
                    System.out.println("NO");
                    reverse =1;
                    break;
                }
                if(count2==3){
                    System.out.println("NO");
                    reverse=1;
                    break;
                }
                if(count3==2)
                {
                    System.out.println("NO");
                    reverse=1;
                    break;
                }
                if(count2==1 && count3==1){
                    System.out.println("NO");
                    reverse=1;
                    break;
                }
            }
            if(reverse!=1)
            System.out.println("YES");
        }
    }
}

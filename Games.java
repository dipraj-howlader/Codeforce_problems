import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n =iScanner.nextInt();
        int[] game = new int[n*2];
        for(int x=0;x<n*2;x++){
            game[x] = iScanner.nextInt();
        }
        int count=0;
        int i=0,j=1;
        int a,b,increase=2;
        for(int x=0;x<(n*(n-1))/2;x++){
            int first = game[i];
            int sec = game[j];
            a = game[increase+i];
            b = game[increase+j];
            if(first==b)
                count++;
            if(sec==a)
            count++;
            increase+=2;
            if((increase+i)>=n*2){
                i=i+2;
                j=j+2;
                increase =2;
                continue;
            }

        }
        System.out.println(count);
    }
}

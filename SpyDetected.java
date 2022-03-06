import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int t = iScanner.nextInt();
        int [] answer = new int[t];
        int z=0;
        for(int i=1;i<=t;i++){
            int n = iScanner.nextInt();
            int[] numbers = new int[n];
            for(int j=0;j<n;j++){
                numbers[j] = iScanner.nextInt();
            }

            int uncommon=0;
            for(int j=2;j<n;j++){
                int first = numbers[0];
                int sec = numbers[j-1];
                int third = numbers[j-2];
                if(numbers[j]==numbers[j-1] && numbers[j-1]==numbers[j-2]){
                    continue;
                }
                else
                {
                    if(numbers[j]==numbers[j-1]){
                        uncommon= j-2;
                        break;
                    }
                    else if(numbers[j]==numbers[j-2]){
                        uncommon = j-1;
                        break;
                    }
                    else{
                        uncommon = j;
                        break;
                    }
                }
            }
            answer[z] = uncommon+1;
            z++;
            uncommon=0;
        }
        for (int v : answer) {
            System.out.println(v);
        }
    }
}

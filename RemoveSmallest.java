import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        for(int x=1;x<=n;x++){
            int a = iScanner.nextInt();
            int[] numbers = new int[a];
            for(int i =0;i<a;i++){
                numbers[i]= iScanner.nextInt();
            }

            Arrays.sort(numbers);
            int count = 0;

                for(int j=1;j<a;j++){
                    if(numbers[j]==numbers[j-1] || (numbers[j]-1 == numbers[j-1])){
                        count++;
                    }
                }
            if(count == a-1 || a==1)
            System.out.println("YES");
            else
            System.out.println("NO");


        }
    }
}

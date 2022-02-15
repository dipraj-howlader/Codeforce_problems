import java.util.Arrays;
import java.util.Scanner;

public class ArraivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] soldiers = new int[n];
        int[] sortingSoldiers = new int[n];
        for(int i=0;i<n;i++){
            int x = iScanner.nextInt();
            soldiers[i] = x;
            sortingSoldiers[i] = x;
        }
        Arrays.sort(sortingSoldiers);
        int min =sortingSoldiers[0];
        int max = sortingSoldiers[n-1];
        int minCount =0;
        int maxCount = 0;
        for(int i=0;i<n;i++){
            if(soldiers[i]!=max)
                maxCount = i+1;
            else 
                break;
        }
        for(int i=n-1,j=1;i>=0;i--){
            if(soldiers[i]!=min){
                minCount = j;
                j++;
            }
            else
                break;
        }
        if(n-minCount> maxCount+1)
            System.out.print(minCount+maxCount);
        else
            System.out.print(maxCount+minCount-1);
    }
}

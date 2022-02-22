import java.util.Scanner;

/**
 * IQTest
 */
public class IQTest {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] hello = new int[n];
        int indexEven = 0;
        int indexOdd = 0;
        int count = 0;
        for(int i=0;i<n;i++)
            hello[i] = iScanner.nextInt();

        for(int i=1;i<=n;i++){
            int number = hello[i-1];
            if(number%2==0){
                count ++;
                indexEven=i;
            }
            else 
            {
                count --;
                indexOdd=i;
            }
        }
        if(count<0){
            System.out.println(indexEven);
        }
        else {
            System.out.println(indexOdd);
        }

    }
}
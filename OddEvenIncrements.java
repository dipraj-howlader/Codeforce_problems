import java.util.Scanner;

public class OddEvenIncrements {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int len = iScanner.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = iScanner.nextInt();
            }
            int typeOne = arr[0]%2;
            int typeTwo = arr[1]%2;
            int countOne = 0;
            int countTwo = 0;
            for(int i=2;i<len;i++){
                if((i+1)%2!=0){
                    if(arr[i]%2!=typeOne)
                    countOne = 1;
                }
                else {
                    if(arr[i]%2!=typeTwo)
                    countTwo = 1;
                }
            }
            if(countTwo==0 && countOne ==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}

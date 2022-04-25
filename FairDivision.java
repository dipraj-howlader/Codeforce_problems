import java.util.Scanner;

/**
 * FoodBuying
 */
public class FairDivision {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int sum = 0;
            int count1 = 0;
            int count2=0;
            for(int i=0;i<n;i++){
                int a = iScanner.nextInt();
                if(a==2)
                count2++;
                else
                count1++;
                sum = sum + a;
            }
            if(sum%2!=0){
                System.out.println("NO");
            }
            else{
                if(count2%2!=0){
                    if(count1>=2 && count1%2==0){
                        System.out.println("YES");
                    }
                    else
                    System.out.println("NO");
                }
                else{
                    if(count1%2==0)
                    System.out.println("YES");
                    else
                    System.out.println("NO");
                }
            }
        }
    }
}
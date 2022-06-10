import java.util.Scanner;

/**
 * HackkerContest
 */
public class ContestCodeforce795 {

    public static void main(String[] args) {
        Scanner iScanner =new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int odd = 0;
            int even = 0;
            for(int i=0;i<n;i++){
                long a = iScanner.nextLong();
                if(a%2==0)
                even++;
                else
                odd++;
            }
            if(odd==0 || even ==0)
            System.out.println(0);
            else if(odd>even)
            System.out.println(even);
            else
            System.out.println(odd);
        }
    }
}
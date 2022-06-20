import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            String str = "9";
            int min = 9;
            if(n>45)
            System.out.println(-1);
            else if(n<10)
            System.out.println(n);
            else{
               int sum = 0, last = 9;
               ArrayList<Integer> arrlist = new ArrayList<>();
               while(sum<n && last>0){
                arrlist.add(Integer.min(n-sum, last));
                sum = sum + last;
                last--;
               }
               for(int i=arrlist.size()-1;i>=0;i--){
                System.out.print(arrlist.get(i));
               }
               System.out.println();
        }
        }
    }
}

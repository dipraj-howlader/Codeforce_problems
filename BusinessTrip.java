import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-12----13:09:03
 * @modify date 2022-04-12----13:09:03
 * @desc [description]
 */
public class BusinessTrip {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int centimeter = iScanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(12);
        int sum = 0;
        for(int i=0;i<12;i++){
            arr.add(iScanner.nextInt());
            sum = sum + arr.get(i);
        }
        Collections.sort(arr, Collections.reverseOrder());
        int count = 0;
        int sumInit = 0;
        while(sumInit<centimeter){
            if(count==12)
            break;
            sumInit = sumInit + arr.get(count);
            count++;
        }
        if(sum<centimeter)
        System.out.println("-1");
        else
        System.out.println(count);

        iScanner.close();
    }
}

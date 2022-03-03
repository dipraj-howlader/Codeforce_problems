import java.util.ArrayList;
import java.util.Scanner;

/**
 * SumOfRoundNumbers
 */
public class SumOfRoundNumbers {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = iScanner.nextInt();
        }
        int doSum = 10;
        int count = 0;
        ArrayList<Integer> insertValues = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int takeValue = numbers[i];
            int loopValue = takeValue;
            while(loopValue!=0){
                int restValue = takeValue%doSum;
                if(restValue!=0){
                    insertValues.add(restValue);
                    count++;
                }
                takeValue = takeValue-restValue;
                doSum =doSum*10;
                loopValue = loopValue/10;

            }
            System.out.println(count);
            for (Integer integer : insertValues) {
                System.out.print(integer + " ");
            }
            System.out.println();
            insertValues.clear();
            count =0;
            doSum = 10;

        }

    }
}
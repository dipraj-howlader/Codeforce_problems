import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-07----21:25:53
 * @modify date 2022-04-07----21:25:53
 * @desc [description]
 */
/**
 * ConstructTheString
 */
public class ConstructTheString {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        String abpha = "abcdefghijklmnopqrstuvwxyz";
        while(test>0){
            test--;
            String fineString = "";
            int len = iScanner.nextInt();
            int sub = iScanner.nextInt();
            int distinct = iScanner.nextInt();
            String subString = abpha.substring(0,distinct);
            int totalDis = sub/distinct;
            int stay = sub%distinct;
            String staySub = subString.substring(0,stay);
            for(int i=0;i<totalDis;i++){
                fineString = fineString + subString;
            }
            fineString = fineString+staySub;
            //for len
            String addFine = fineString;
            totalDis = len / sub;
            stay = len% sub;
            staySub = fineString.substring(0, stay);
            for(int i = 1;i<totalDis;i++){
                fineString =fineString + addFine;
            } 
            fineString = fineString + staySub;
            System.out.println(fineString);

        }
        iScanner.close();
    }
}
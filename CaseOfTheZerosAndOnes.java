import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-07----22:34:59
 * @modify date 2022-04-07----22:34:59
 * @desc [description]
 */
public class CaseOfTheZerosAndOnes {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int len = iScanner.nextInt();
        String str = iScanner.next();
        char[] charString = str.toCharArray();
        int countZero = 0;
        int countOne = 0;
        for(int i=0;i<charString.length;i++){
            if(charString[i]=='1')
            countOne++;
            else
            countZero++;
        }
        System.out.println((int)Math.abs(countOne-countZero));
    }
}

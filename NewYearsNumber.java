import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-05----08:26:48
 * @modify date 2022-04-05----08:39:23
 * @desc [description]
 */
public class NewYearsNumber {
   public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    int test = iScanner.nextInt();
    while(test>0){
        test--;
        int n = iScanner.nextInt();
        int stay = n%2020;
        int stayTwo = n - (stay*2021);
        if(stayTwo<0)
        System.out.println("NO");
        else{
        int fi = stayTwo % 2020;
        if(fi==0)
        System.out.println("YES");
        else 
        System.out.println("NO");
        }
    }
   } 
}

import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-15----21:43:31
 * @modify date 2022-04-15----21:43:31
 * @desc [description]
 */
public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            int a = iScanner.nextInt();
            int b = iScanner.nextInt();
            int c = iScanner.nextInt();
            int d = iScanner.nextInt();
            int lowGrains = a-b;
            int highGrains = a+b;
            lowGrains = lowGrains*n;
            highGrains = highGrains*n;
            int lowWeight = c-d;
            int hightWeight = c+d;
            if((lowGrains>=lowWeight && lowGrains<=hightWeight)||(highGrains>=lowWeight && highGrains<=hightWeight)){
                System.out.println("Yes");
            }
            else if(lowGrains<lowWeight && highGrains>hightWeight)
            System.out.println("Yes");
            else
            System.out.println("No");

        }
        iScanner.close();
    }
}

import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-12----00:48:49
 * @modify date 2022-04-12----00:48:49
 * @desc OI MAIYA SARADIN KI KORE? 
 */
public class MissingBigram {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            int n = iScanner.nextInt();
            String str = iScanner.nextLine();
            char[] charStr = str.toCharArray();
            String finalString = "";
            for(int i=0;i<charStr.length;i++){
                if(charStr[i]==' '){
                    if(charStr[i-1]==charStr[i+1]);

                }
                else{
                    finalString=finalString+charStr[i];
                }
            }
        }
    }
}

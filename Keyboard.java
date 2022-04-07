import java.util.Scanner;

/**
 * @author Dipraj Howlader
 * @email dipraj17@cse.pstu.ac.bd
 * @create date 2022-04-06----21:51:00
 * @modify date 2022-04-06----21:51:00
 * @desc [description]
 */
public class Keyboard {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String c = iScanner.nextLine();
        String str = iScanner.nextLine();
        char[] charString = str.toCharArray();
        String key = "qwertyuiopasdfghjkl;zxcvbnm,./";
        int move=0;
        if(c.charAt(0)=='R'){
            move=-1;
        }
        else
        move++;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<key.length();j++){
                if(charString[i]==key.charAt(j)){
                    if(move==-1){
                        System.out.print(key.charAt(j-1));
                    }
                    else{
                        System.out.print(key.charAt(j+1));
                    }
                }
            }
        }
        
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int m = iScanner.nextInt();
        String body = new String();
        String empty = new String();
        for(int i=1;i<=m;i++){
            String hastag = "#";
            String left = ".";
            body = hastag + body;
            if(i<=m-1)
            empty = empty+left;
        }
        empty = empty+"#";
        String reEmpty = "";
        for(int i=0;i<empty.length();i++){
            char ch = empty.charAt(i);
            reEmpty = ch+reEmpty;
        }

        for(int i =1;i<=n;i++){
            if(i%2!=0){
                System.out.println(body);
            }
            else if(i%4==0){
                System.out.println(reEmpty);
            }
            else{
                System.out.println(empty);
            }

        }

    }
}

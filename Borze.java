import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.next();
        for(int i=0;i<str.length();){
            if(str.charAt(i)=='.'){
            System.out.print(0);
            i++;
            }
            else if(str.charAt(i)=='-')
            {
                if(str.charAt(i+1)=='.')
                System.out.print(1);
                else
                System.out.print(2);
                i+=2;
            }
        }
    }
}

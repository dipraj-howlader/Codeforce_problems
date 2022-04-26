import java.util.Scanner;

/**
 * MagicNumbers
 */
public class MagicNumbers {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.next();
        str = str.replaceAll("144", "/");
        str = str.replaceAll("14", "/");
        str = str.replaceAll("1", "/");
        int count = 0;
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)!='/')
        count++;
        if(count>0)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}
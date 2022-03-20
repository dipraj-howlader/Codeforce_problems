import java.util.ArrayList;
import java.util.Scanner;

public class PrefixRemovals {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            String str = iScanner.next();
            int len = str.length();
            int i = 0;
            ArrayList<String> s = new ArrayList<String>();
            String nstr = "";
            char ch;
            for (int j=0; j<str.length(); j++)
            {
              ch= str.charAt(j); //extracts each character
              nstr= ch+nstr; //adds each character in front of the existing string
            }
            str = nstr;
            // System.out.println(str);
            while(len>0){
                String fir = String.valueOf(str.charAt(i));
                s.add(fir);
                str = str.replaceAll(fir, "");
                len =str.length();
            }
            for(int j=s.size()-1;j>=0;j--){
                System.out.print(s.get(j));
            }
            test--;
            System.out.println();
        }
    }
}

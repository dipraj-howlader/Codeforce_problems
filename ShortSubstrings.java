import java.util.Scanner;

/**
 * ShortSubstrings
 */
public class ShortSubstrings {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        for(int i=1;i<=n;i++){
            String substring = iScanner.next();
            int length = substring.length();
            if(length<=3){
                System.out.println(substring);
            }
            else{
            char first = substring.charAt(0);
            char last = substring.charAt(length-1);
            String sub = substring.substring(1, length-1);
            String returnSub = mainString(sub);
            System.out.println(first+returnSub+last);
            }
        }
    }

    private static String mainString(String sub) {
        String addIt="";
        for(int i=1;i<sub.length();i=i+2){
            if(sub.charAt(i)==sub.charAt(i-1)){
                addIt = addIt+sub.charAt(i);
            }
            else{
                char firstC = sub.charAt(i-1);
                char secondC = sub.charAt(i);
                addIt = addIt+firstC+secondC;
            }
        }
        return addIt;
    }
}
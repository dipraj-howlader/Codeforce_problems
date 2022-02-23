import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String guest =iScanner.next();
        String host = iScanner.next();
        String suf = iScanner.next();
        StringBuilder str = new StringBuilder(suf);
        String guestAndHost = guest+host;
        int count =0;
        for(int i=0;i<guestAndHost.length();i++){
            for(int j=0;j<str.length();j++){
                if(guestAndHost.charAt(i)==str.charAt(j)){
                    count++;
                    str = str.deleteCharAt(j);
                    break;
                }  
            }
        }
        if(count == guestAndHost.length() && (guestAndHost.length()==suf.length()))
            System.out.println("YES");
        else 
        System.out.println("NO");
    }
}

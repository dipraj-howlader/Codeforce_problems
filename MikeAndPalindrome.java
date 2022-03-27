import java.util.Scanner;

public class MikeAndPalindrome {
    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        String str = iScanner.next();
        int len = str.length();
        int count = 0;
        if(len%2==0){
            for(int i=0,j=len-1;i<len/2;i++,j--){
                if(str.charAt(i)!=str.charAt(j))
                count++;
            }
        }
        else{
            for(int i=0,j=len-1;i<=((len/2) -1);i++,j--){
                if(str.charAt(i)!=str.charAt(j))
                count++;
                
            }
            if(count==0)
            count++;
        }
        if(count ==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        iScanner.close();
    }
}

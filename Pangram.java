import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        String take = iScanner.next();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int count =0;
        if(n<26){
            System.out.println("NO");
        }
        else {
            take = take.toLowerCase();
            for(int i=0;i<26;i++)
            {
                char match = '8';
                for(int j=0;j<n;j++){
                    if((alpha.charAt(i)==take.charAt(j))&&(alpha.charAt(i)!=match)){
                        count++;
                        break;
                    }
                }
            }
            if(count ==26)
                System.out.println("YES");
            else 
            System.out.println("NO");
        }
    }
}

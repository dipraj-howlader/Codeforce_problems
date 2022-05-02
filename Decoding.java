import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        String st = iScanner.next();
        StringBuilder str = new StringBuilder(st);
        String fString = "";
        int i = 0;
        while(n>0){
            if(i%2==0){
                fString = fString + str.charAt(i);
            }
            else{
                fString = str.charAt(i) + fString;
            }
            n--;
            i++;
        }
        if(fString.length()%2!=0)
        System.out.println(fString);
        else{
            StringBuilder rev = new StringBuilder(fString);
            System.out.println(rev.reverse());
        }
    }
}

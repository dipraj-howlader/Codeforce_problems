import java.util.Scanner;

public class FriendVisit {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int a =iScanner.nextInt();
        int b =iScanner.nextInt();
        int c = iScanner.nextInt();
        int ab = a-b;
        if(ab<0)
        ab=-1*ab;
        int bc = b - c;
        if(bc<0)
        bc = -1*bc;
        System.out.println(ab+bc);
        
    }
}

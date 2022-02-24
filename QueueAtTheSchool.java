import java.util.Scanner;

/**
 * QueueAtTheSchool
 */
public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int time = iScanner.nextInt();
        String str = iScanner.next();

        for(int i=0;i<time;i++){
            str  =str.replaceAll("BG", "GB").trim();
        }
        System.out.println(str);

    }
    
}
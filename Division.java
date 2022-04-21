import java.util.Scanner;

public class Division {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       int test = iScanner.nextInt();
       while(test>0){
           test--;
           int score = iScanner.nextInt();
           if(score<=1399)
           System.out.println("Division 4");
           else if(score<=1599 && score>=1400)
           System.out.println("Division 3");
           else if(score<=1899 && score>=1600)
           System.out.println("Division 2");
           else 
           System.out.println("Division 1");
       }
   } 
}

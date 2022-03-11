import java.util.Scanner;
 
public class DeletionsOfTwoAdjacentLetters {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int i =1;i<=test;i++){
            String str = iScanner.next();
            String s = iScanner.next();
            char c = s.charAt(0);
            int length = str.length();
            int index = length/2;
            if(length==5){
            if(str.charAt(index)==c){
                System.out.println("YES");
            }
            else 
            System.out.println("NO");
            }
            else if(length<5){
                System.out.println("NO");
            }
            else {
                
            }
        }
    }
}
import java.util.Scanner;

public class ColorfulStamp {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test --;
            int n = iScanner.nextInt();
            String str = iScanner.nextLine();
            if(n==1)
            System.out.println("NO");
            else if(n==2){
                if(str.equals("BR")==true|| str.equals("RB")==true)
                {
                    System.out.println("YES");
                }
                else 
                System.out.println("NO");
            }
            else{
                for(int i=0;i<n;i++){
                    
                }
            }
        }
    }
}

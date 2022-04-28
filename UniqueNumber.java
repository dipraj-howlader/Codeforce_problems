import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            String str = "9";
            int min = 9;
            if(n>45)
            System.out.println(-1);
            else if(n<10)
            System.out.println(n);
            else{
                n = n-9;
            while(n>0){
                if(n<9){
                    str = str + n;
                    n=0;
                }
                else{
                    char s = str.charAt(str.length()-1);
                    int num = Integer.valueOf(s);
                    num--;
                    str = str + num;
                    n = n - num;
                }
            }
            System.out.println(str);
        }
        }
    }
}

import java.util.Scanner;

public class Prefixs {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            String str = iScanner.next();
            int count = 0;
            int a=0;
            for(int i=0;i<str.length();){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count = i+1;
                       break;
                    }
                    else
                    a++;
                }
                if(a+i+1==str.length())
                break;
                i++;
                a=0;
            }
            for(int i = count;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
            test--;
            System.out.println();
        }
    }
}

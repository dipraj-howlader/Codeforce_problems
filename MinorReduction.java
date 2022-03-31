import java.util.Scanner;

public class MinorReduction {
    //unsovled , runntime error on 5 case
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            String str = iScanner.next();
            int len = str.length();
            long high = 0;
            String str1= "";
            String str2 = "";
            String mainString = "";

            for(int i=1;i<str.length();i++){
                int a = str.charAt(i-1)-48;
                int b = str.charAt(i)-48;
                int sum = a+b;
                String sumString  = String.valueOf(sum);
                str1 = str.substring(0, i-1);
                str2 = str.substring(i+1, len);
                mainString = str1+sumString+str2;
                long value = Long.parseLong(mainString);
                if(value>high){
                    high = value;
                }
                }
                System.out.println(high);
        }
        iScanner.close();
    }
}

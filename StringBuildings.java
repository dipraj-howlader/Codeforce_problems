import java.util.Scanner;

public class StringBuildings {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            String str = iScanner.next();
            int count = 1;
            for(int i=0;i<str.length();){
                char a = str.charAt(i);
                count=1;
                int j=i+1;
                for(;j<str.length();j++){
                    if(a==str.charAt(j))
                    {
                        count++;
                    }
                    else{
                        break;
                    }
                }
                i=j;
                if(count==1){
                    System.out.println("NO");
                    break;
                }

            }
            if(count!=1)
            System.out.println("YES");
        }
    }
}

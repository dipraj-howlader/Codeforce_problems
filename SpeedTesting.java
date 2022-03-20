import java.util.Scanner;

public class SpeedTesting {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            String str1 = iScanner.next();
            String str2 = iScanner.next();
            int len1 = str1.length();
            int len2 = str2.length();
            if(str1.compareTo(str2)==0)
            System.out.println(0);
            else{
                int breakint = 0;
                for(int i =1;i<len2;){
                    for(int j =1;j<len1;){
                        if(str2.charAt(i-1)!=str1.charAt(j-1)){
                            System.out.println("IMPOSSIBLE");
                            breakint = 1;
                            break;

                        }
                        else{
                            if(str2.charAt(i-1)==str2.charAt(i)){
                                i++;
                                break;
                            }
                            else{

                            }
                        }
                    }
                    if(breakint==1)
                    break;
                }
            }  
        }
    }
}

import java.util.Scanner;

/**
 * DoNotBeDistracted
 */
public class DoNotBeDistracted {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        for(int i=1;i<=test;i++){
            int length = iScanner.nextInt();
            String str = iScanner.next();
            int count = 0;
            for(int j=1;j<length;){
                if(str.charAt(j)==str.charAt(j-1)){
                    j++;
                }
                else{
                    char find = str.charAt(j-1);
                    for(int z = j+1;z<length;z++){
                        if(str.charAt(z)==find){
                            count++;
                        }
                    }
                    j++;
                }
                if(count>0)
                break;

            }
            if(count>0)
            System.out.println("NO");
            else 
            System.out.println("YES");
        }

    }

}
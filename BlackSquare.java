import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] num = new int[4];
        for(int i=0;i<4;i++){
            num[i] = iScanner.nextInt();
        }
        int sum = 0;
        String str = iScanner.next();
        for(int i=0;i<str.length();i++){
            char value = str.charAt(i);
            if(value=='1')
                sum = sum + num[0];
            else if(value=='2')
            sum = sum + num[1];
            else if(value=='3')
            sum = sum + num[2];
            else
            sum = sum + num[3];
        }
        System.out.println(sum);
    }
}

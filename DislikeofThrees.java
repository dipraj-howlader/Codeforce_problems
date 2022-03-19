import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int[] xNumbers = new int[1000];
        int  j=1;
        for(int i = 0;i<1000; ){
            if(j%3!=0 && j%10 !=3){
                xNumbers[i] = j;
                i++;
            }
            j++;
        }
        for(int i=1;i<=test;i++){
            int num = iScanner.nextInt();
            System.out.println(xNumbers[num-1]);
        }
    }
}

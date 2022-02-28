import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n =iScanner.nextInt();
        int[] contest = new int[n];
        for(int i=0;i<n;i++){
            contest[i] = iScanner.nextInt();
        }
        int min = contest[0];
        int max = contest[0];
        int count=0;
        for(int i = 1;i<n;i++){
            if(contest[i]<min){
                min = contest[i];
                count++;
            }
            else if(contest[i]>max){
                max = contest[i];
                count++;
            }
        }
        System.out.println(count);

    }
}

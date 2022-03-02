import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int event = iScanner.nextInt();
        int[] crime = new int[event];
        for(int i=0;i<event;i++){
            crime[i] = iScanner.nextInt();
        }
        int police = 0;
        int appear = 0;
        int solved = 0;
        for (int i : crime) {
            if(i!=-1){
                police = police+i;
            }
            if(i==-1){
                appear++;
            }
            if(police>0 && i==-1){
                police = police +i;
                solved++;
            }

        }
        System.out.println(appear-solved);

    }
}

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int students = iScanner.nextInt();
        int leastTimes = iScanner.nextInt();
        int timeHave = 5-leastTimes;
        int count = 0;
        for(int i=1;i<=students;i++){
            int participated = iScanner.nextInt();
            if(participated<=timeHave)
            count++;
        }
        int teamFormed = count/3;
        System.out.println(teamFormed);
    }
}

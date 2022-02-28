import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int problems = iScanner.nextInt();
        int currentTime = iScanner.nextInt();
        int totalTime = 240;


        int countProblem = 0;
        while(totalTime>=currentTime && countProblem<=problems){
            countProblem++;
            currentTime = 5*countProblem + currentTime;

        }
        System.out.println(countProblem-1);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] points = new int[3];
        int sum =0;
        for(int i=0;i<3;i++){
            points[i] = iScanner.nextInt();
        }
        Arrays.sort(points);
        int mid = points[1];
        int totalDistance = (points[2]-mid) + (mid-points[0]);
        System.out.println(totalDistance);

    }  
}

import java.util.Scanner;

/**
 * CandiesDivision
 */
public class CandiesDivision {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while (test > 0) {
            test--;
            long numberOfCandis = iScanner.nextLong();
            long numberOfKids = iScanner.nextLong();

            long totalFin = numberOfCandis - numberOfCandis % numberOfKids;
            totalFin = totalFin + Long.min(numberOfCandis % numberOfKids, numberOfKids / 2);
            System.out.println(totalFin);

        }
    }
}
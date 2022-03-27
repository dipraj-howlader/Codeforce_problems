import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a = iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = iScanner.nextLong();
            String str = MakeAPS(a,b,c);
            System.out.println(str);

        }

        iScanner.close();
    }

    private static String MakeAPS(long a, long b, long c) {
        long new_a = b - (c - b);
    if(new_a >= a && new_a % a == 0 && new_a != 0) {
        return "YES";
    }

    long new_b = a + (c - a)/2;
    if(new_b >= b && (c-a)%2 == 0 && new_b % b == 0 && new_b != 0) {
        return "YES";
    }

    long new_c = a + 2*(b - a);
    if(new_c >= c && new_c % c == 0 && new_c != 0) {
        return "YES";
    }
    return "NO";
    }
}

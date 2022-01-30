import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		long n = inpScanner.nextLong();

		if(n>=1) {
			int k=0;
		for(long i=n ;i>0;i= i/10) {

			if(i%10 == 4 || i%10 == 7) {
				++k;
			}
		}
		if(k == 7 || k == 4 )
			System.out.print("YES");
		else
			System.out.print("NO");
		}
	}
}

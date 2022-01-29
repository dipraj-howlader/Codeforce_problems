import java.util.Scanner;

public class WrongSubtraction {
	public static long subs(long n) {
		if(n%10==0) {
			return n/10;
		}
		else
			return n-1;
		
		
	}
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		long n = inScanner.nextLong();
		int k = inScanner.nextInt();
		if(k>=1 && k<=50 && n>=2 && n<= (100000*100000)) {
			// code here
			for(int i=1;i<=k;i++) {
				n = subs(n);
			}
			System.out.print(n);
		}
	}
}

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		long stay=0;
		long minus;
		long n = inScanner.nextLong();
		long k = inScanner.nextLong();
		if(n%2==0) {
			if(k>n/2) {
				minus=n-k;
				stay = n - (minus*2);
			}
			else
			{
				minus = (n/2)-k;
				stay = n-(1+(minus*2));
			}
				
		}
		else {
			if(k>((n/2)+1)) {
				minus = n-k;
				stay = n-(1+(minus*2));
			}
			else
			{
				minus = (n/2)+1-k;
				
			}
		}
		System.out.print(stay);
	}

}

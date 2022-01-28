import java.util.Scanner;

public class SoldierAndBananas {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int k = inputScanner.nextInt();
		long n = inputScanner.nextLong();
		int w = inputScanner.nextInt();
		long sum =0;
		if(k>=1 && w<=1000 && n>=0 && n<=(100000*100000)) {
			// code here
			for(int i=1;i<=w;i++) {
				sum = (k*i) + sum;
			}
			long stay = sum - n;
			if(stay>0)
			System.out.print(stay);
			else
				System.out.print("0");
		}
		
	}
}

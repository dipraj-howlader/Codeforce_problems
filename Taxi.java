import java.util.Scanner;
// can't solve it
public class Taxi {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n= inScanner.nextInt();
		int[] grps = new int[n];
		int sum = 0;
		if(n>=1 && n<=1000000) {
		for(int i = 0;i<n;i++) {
			grps[i] = inScanner.nextInt();
			if(grps[i]<=4)
			sum = sum+grps[i];
		}
		double texis = sum/3.000000;
		if(texis>(int)texis)
		System.out.print((int)texis+1);
		else
			System.out.print(texis);
		
		}

	}

}

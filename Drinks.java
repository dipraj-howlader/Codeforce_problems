import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		float sum = 0;
		int i;
		for(i=0;i<n;i++) {
			double take = inScanner.nextFloat();
			sum+=take;
		}
		double k = i;
		System.out.printf("%.12f",(Float)sum/k);
	}

}

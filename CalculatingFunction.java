import java.util.Scanner;

public class CalculatingFunction {

	public static void main(String[] args) {
		//code here
		Scanner inScanner = new Scanner(System.in);
		long n = inScanner.nextLong();
		long sum =0;
		if(n%2==0) {
			sum = n/2;
		}
		else
		{
			sum = -((n/2)+1);
		}
		System.out.print(sum);

	}

}

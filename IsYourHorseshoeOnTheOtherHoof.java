import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		long[] shoes  = new long[4];
		int count=0;
		for(int i=0;i<4;i++) {
			shoes[i] = inScanner.nextLong();
		}
		Arrays.sort(shoes);
		for(int i=0;i<3;i++) {
			if(shoes[i]==shoes[i+1])
			{
				count++;
			}
		}
		System.out.print(count);
	}	

}

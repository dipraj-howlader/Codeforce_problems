import java.util.Arrays;
import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int[] digits = new int[3];
		int[] cal = new int[4];
	
		for(int i=0;i<3;i++)
			digits[i] = inScanner.nextInt();
			Arrays.sort(digits);
		cal[0]=digits[0]+digits[1]*digits[2];
		cal[1]=digits[0]*(digits[1]+digits[2]);
		cal[2]=digits[0]*digits[1]*digits[2];
		cal[3]=(digits[0]+digits[1])*digits[2];
		int max=cal[0];
		for (int i = 1; i < cal.length; i++)
            if (cal[i] > max)
                max = cal[i];
		
			System.out.print(max);
	}

}

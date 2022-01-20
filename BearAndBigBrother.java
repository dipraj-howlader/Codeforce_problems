import java.util.Scanner;

public class BearAndBigBrother {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int year=0;
			
			if(a>=1 && b>=1 && a<=10 && b<=10 && a<=b) {
				// code in here
				
				while(a<=b) 
				{
					a = a*3;
					b = b*2;
					year++;
					if(a>b)
						break;

					
				}
				System.out.print(year);
			}
	}
}

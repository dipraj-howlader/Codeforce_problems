import java.util.Arrays;
import java.util.Scanner;

public class BeautifulYear {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n= inScanner.nextInt();
		int [] num = new int[4];
		int count=1;
		if(n>=1000 && n<=9000) {
			
			while(count!=0) {
				count=0;
			n=n+1;
			int year = n;
			for(int i=0;i<4;i++) {
				num[i]=year%10;
				year/=10;
			}
			Arrays.sort(num);
			for(int j=1;j<4;j++) {
				if(num[j-1]==num[j]) {
					count++;
				}
			}
			
			}
			System.out.print(n);
			
			}
	}

}

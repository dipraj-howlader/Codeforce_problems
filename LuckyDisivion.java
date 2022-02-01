import java.util.ArrayList;
import java.util.Scanner;

public class LuckyDisivion {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int j=0;
		int k=0;
		int a = 0;
		int b=0;
		int count=0;
		int l=0;
		ArrayList<Integer> lucky = new ArrayList<Integer>();
		if(n>=1 && n<=1000) {
			for(int i=n;i>0;i/=10) {
				j++;
				if(i%10 == 4 || i%10 == 7) {
					k++;
				}
			}
			for(int i=1;i<n;i++) {
				for(int x=i;x>0;x/=10) {
					a++;
					if(x%10 == 4 || x%10 == 7)
						b++;
				}
				if(a==b) {
				lucky.add(l,i);
				a=b=0;
				l++;
				}
				else
					a=b=0;
					
			}
			for(int x: lucky) {
				if(n%x==0) {
				count++;	
				}
			}
			if(count==0) {
			if(k==j)
				System.out.print("YES");
			else
				System.out.print("NO");
			}
			else 
				System.out.print("YES");	
		}

	}

}

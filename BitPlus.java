import java.util.Scanner;

public class BitPlus {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 0;
		String str = "++X";
		String str1 = "X++";
		String str2 = "--X";
		String str3 = "X--";
		String sInput;
		if(n>=1 && n<=150) {

			// your code is here
			for(int i =0;i<n;i++) {
				sInput = s.next();
				int a = sInput.compareTo(str);
				int b = sInput.compareTo(str1);
				int c = sInput.compareTo(str2);
				int d = sInput.compareTo(str3);
				
				if(a==0 || b==0)
					x++;
				else if(c==0 || d==0)
					x--;

			}
			System.out.print(x);
			
		}
	}
}

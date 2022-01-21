import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner is = new Scanner(System.in);
		String ft = is.nextLine();
		if(ft.length()<=100) {
		char c1 ;
		char c2 = '0';
		c1 = ft.charAt(0);
		if(c1 == c2) {
			c2 = '0';
		}
		else
			c2 = '1';
		int count = 0;
		for(int i = 1;i<ft.length();i++) {
			if(c2 == ft.charAt(i)) {

				count++;
				if(count == 6) {
					break;
				}
			}
			else{
				count =0;
			}
			c2 = ft.charAt(i);
		}
		//
		if(count ==6) {
			System.out.print("YES");
		}
		else
			System.out.print("NO");
		}
	}
}

import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		 int n = inScanner.nextInt();
		 int c=0, temp =0;
		 if(n>=2 && n<=1000) {
			 //code here
			 for(int i=1;i<=n;i++) {
				 int a = inScanner.nextInt();
				 int b = inScanner.nextInt();
				 c = c-a+b;
				 if(c>temp)
					 temp = c;
			 }
			 System.out.print(temp);
		 }
	}
}

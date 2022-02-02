import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int h = inScanner.nextInt();
		int[] hights = new int[n];
		int width=0;
		
		if(n>=1 && n<=1000 && h>=1 && h<=1000) {
			for(int i=0;i<n;i++) {
				int a = inScanner.nextInt();
				if(a>=1 && a<=(2*h))
					hights[i]=a;
			}
			
			for(int x: hights) {
				if(x>h)
					width+=2;
				else
					width+=1;
			}
			System.out.print(width);
			
			
		}

	}

}

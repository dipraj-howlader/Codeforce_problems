import java.util.Scanner;

public class InSearchofanEasyProblem {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int[] problems= new int[n];
		int sum=0;
		if(n>=1 && n<=100) {
			for(int i=0;i<n;i++) {
				problems[i] = inScanner.nextInt();
			}
			for(int x: problems) {
				sum=sum+x;
			}
			if(sum==0)
				System.out.print("EASY");
			else
				System.out.print("HARD");
		}

	}

}

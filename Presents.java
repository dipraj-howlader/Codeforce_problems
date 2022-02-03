import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n= inScanner.nextInt();
		int[] takefrd = new int[n];
		int[] earnfrd = new int[n];
		int[] finalfrd = new int[n];
		int q,k;
		for(int i=0;i<n;i++) {
			takefrd[i] = inScanner.nextInt();
			earnfrd[i]=i+1;
		}
		for(int i=0;i<n;i++) {
			k= takefrd[i];
			q= earnfrd[i];
			finalfrd[k-1]=q;
		}
		for(int x: finalfrd) {
			System.out.print(x + " ");
		}
	}

}

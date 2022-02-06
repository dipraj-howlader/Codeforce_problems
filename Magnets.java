import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n= inScanner.nextInt();
		String[] magnetStrings = new String[n];
		int grpCount=1;
		if(n>=1 && n<=100000) {
		for(int i=0;i<n;i++) {
			magnetStrings[i] = inScanner.next();
			}
		String tempString = magnetStrings[0];

		for(int i=1;i<n;i++) {
			if(tempString.equals(magnetStrings[i])) {
				tempString=magnetStrings[i];
				continue;
			}
			else {
				grpCount++;
				tempString=magnetStrings[i];
				}
		}
		System.out.print(grpCount);
		}
	}

}

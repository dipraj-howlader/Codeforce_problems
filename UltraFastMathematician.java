import java.util.Scanner;

public class UltraFastMathematician {

	public static void main(String[] args) {
		//code here
		Scanner inScanner = new Scanner(System.in);
		String fStrings = inScanner.next();
		String sStrings = inScanner.next();
		String[] newStrings = new String[fStrings.length()];
		for(int i=0;i<fStrings.length();i++) {
			if(fStrings.charAt(i)==sStrings.charAt(i))
				newStrings[i] = "0";
			else
				newStrings[i]="1";
		}
		for(String x: newStrings)
			System.out.print(x);

	}

}

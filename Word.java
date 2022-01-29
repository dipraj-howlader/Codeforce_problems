import java.util.Scanner;

public class Word {
	public static void UpOrLow(String str) {
		int upCount=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
				upCount++;
			else
				upCount--;
			
		}
		if(upCount>0)
			System.out.print(str.toUpperCase());
		else if(upCount==0)
			System.out.print(str.toLowerCase());
		else
			System.out.print(str.toLowerCase());
	}
	
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		String upString = inScanner.nextLine();
		if(upString.length()>=1 && upString.length()<=100) {
			UpOrLow(upString);
		}
	}
}

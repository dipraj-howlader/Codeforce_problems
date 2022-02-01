import java.util.Scanner;

public class AntonandDanik {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		String winnerString = inScanner.next();
		winnerString = winnerString.toUpperCase();
		int aCount = 0;
		int dCount = 0;
		if(n>=1 && n<=100000) {
			for(int i=0;i<n;i++) {
				if(winnerString.charAt(i)=='A')
					aCount++;
				else
					dCount++;
			}
			if(dCount==aCount)
				System.out.print("Friendship");
			else if(dCount>aCount)
				System.out.print("Danik");
			else
				System.out.print("Anton");
		}
	}

}

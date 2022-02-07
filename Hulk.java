import java.util.ArrayList;
import java.util.Scanner;

public class Hulk {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		ArrayList<String> hulkEmotion = new ArrayList<String>(); 
		String hateString = "I hate";
		String loveString = "I love";
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				hulkEmotion.add(loveString);
			}
			else
			{
				hulkEmotion.add(hateString);
			}
			if(n>=1 && n!=i)
				hulkEmotion.add("that");
				
			
		}
		hulkEmotion.add("it");
		for(String x: hulkEmotion)
			System.out.print(x+ " ");
	}

}

import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		String s = inScanner.nextLine();
		String hString = "hello";
		s = s.toLowerCase();
		int j=0;
		if(s.length()>=1 && s.length()<=100) {
			//code here
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==hString.charAt(j)) {
					j++;
					if(j==hString.length())
						break;
				}
			}
			if(j==5)
				System.out.print("YES");
			else
				System.out.print("NO");
		}
	}
}

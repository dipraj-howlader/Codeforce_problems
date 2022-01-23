import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String numString = input.nextLine();
		int take = 0;
		int[] numberArr = new int[numString.length()]; 
		 int countNum =0;
		if(numString.length()<=100) {
			//code here
			for(int i=0;i<numString.length();i++) {
				if(numString.charAt(i)!='+') {
					char num = numString.charAt(i);
					int number = Integer.parseInt(String.valueOf(num));
					take = take * 10 + number;
					if(i+1 == numString.length()) {
						numberArr[countNum] = take;
						countNum++;
						take = 0;
					}
				}
				else {
					numberArr[countNum] = take;
					countNum++;
					take = 0;
				}
			}
			int[] sortArr = new int[countNum];
			for(int i = 0;i<countNum;i++) {
			    sortArr[i] =numberArr[i];		
			}
			Arrays.sort(sortArr);
			for(int i = 0;i<countNum;i++) {
			    System.out.print(sortArr[i]);
			    if(i+1 !=countNum)
			    	System.out.print("+");
			}
			
			//code rest
		}
	}
}

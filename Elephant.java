import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int count=0;
		if(n>=1 && n<=1000000) {
			while(n>0) {
				if(n>=5) {
					n = n-5;
					count++;
				}
				else if(n>=4) {
					n = n -4;
					count++;
				}
				else if(n>=3) {
					n = n -3;
					count++;
				}
				else if(n>=2) {
					n = n -2;
					count ++;
					}
				else if(n>=1) {
					n=n-1;
					count++;}
				else
					break;
			}
			System.out.print(count);
		}
	}
}

import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
			int n = s.nextInt();
			int k = s.nextInt();
			int[] values = new int[n+1];
			int count = 0;
			int stop = n-1;
			if((n>=1&&n<=50) && (k>=1 &&k<=50) && (n>=k)) {
			
			for(int i = 0;i<n;i++) {
				int take = s.nextInt();
				if(take>=0 && take<=100)
				values[i] =take;
			}
			for(int i =0;i<n;i++) {
	
				if(values[i]>=values[i+1]) {
				if(values[i]>k) {
					count++;
				

				}	
				
			}
			}
			System.out.println(count);
			}
	}
}

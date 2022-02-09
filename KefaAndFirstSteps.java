import java.util.Scanner;

public class KefaAndFirstSteps {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		long[] inputs = new long[n];
		for(int i=0;i<n;i++) {
			inputs[i] = inScanner.nextLong();			
		}
		System.out.print(firstStep(inputs));
		
	}

	private static int firstStep(long[] inputs) {
		if(inputs.length==1)
			return 1;
		else {
			int count =1; int maxCount = Integer.MIN_VALUE;
			for(int i = 0;i<inputs.length-1;i++) {
				if(inputs[i]<=inputs[i+1]) {
					count++;
				}
				else {
					count=1;
				}
				if(count>maxCount)
					maxCount = count;
			}
			return maxCount;
		
		}
	}

}

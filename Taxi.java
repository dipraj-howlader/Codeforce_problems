import java.util.Scanner;

/**
 * Taxi
 */
public class Taxi {

	public static void main(String[] args) {
		Scanner iScanner = new Scanner(System.in);
		int n = iScanner.nextInt();
		int[] groups = new int[n];
		int count1=0,count2= 0,count3=0,count4=0,min_taxi=0;
		int sum=0;
		for(int i=0;i<n;i++){
			groups[i] = iScanner.nextInt();
			if(groups[i]==4)
				count4++;
				
			if(groups[i]==3)
			count3++;
			
			if(groups[i]==2)
				count2++;
			
			if(groups[i]==1)
				count1++;
			}

			min_taxi = count4;
			count4=0;

			while(count3!=0 && count1!=0){
				count3 = count3-1;
				count1 = count1 - 1;
				min_taxi++;
			}
			if(count3!=0 && count1==0){
				min_taxi = min_taxi + count3;
				count3=0;
			}
			sum = count2*2 + count1;
			while(sum>0){
				sum = sum-4;
				min_taxi++;
			}
			System.out.println(min_taxi);
	}
}
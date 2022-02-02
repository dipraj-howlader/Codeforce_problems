import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Twins {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int[] value = new int[n];
		if(n>=1 && n<=100) {
			for(int i =0;i<n;i++) {
				value[i] = inScanner.nextInt();
			}
			Arrays.sort(value);
			value=reverse(value);
			int sum=0;
			for(int x:value) {
				sum =sum+x;
			}
			int minusSum=sum;
			if(sum%2!=0)
				minusSum=minusSum+1;
//			int minusNum=0;
			int x=0;
			while(sum>=(minusSum/2)) {
				sum= sum-value[x];
				x++;
			}
			System.out.print(x);
		}

	}

	private static int[] reverse(int[] value) {
		int [] okbro = new int[value.length];
		for(int i=0;i<value.length;i++) {
			okbro[i] =  value[value.length-(i+1)];
		}
		return okbro;
		// TODO Auto-generated method stub
		
	}

}

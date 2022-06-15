import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayReodering {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0) {
            test--;
            int n = iScanner.nextInt();
            int even = 0;
            int arr[] = new int[n];
            ArrayList<Integer> arrOdd = new ArrayList<>(); 
            for(int i = 0 ;i<n;i++){
                arr[i] = iScanner.nextInt();
                if(arr[i]%2==0)
                even++;
                else
                arrOdd.add(arr[i]);
            }
            Collections.sort(arrOdd);
            int totalOrdering = 0;
            totalOrdering = (n * even) - (even*(even+1)/2);
            for(int i=0;i<arrOdd.size();i++){
                for(int j=i+1;j<arrOdd.size();j++){
                    int a = arrOdd.get(j);
                    int b = arrOdd.get(i);
                    if(gcdOf(a,b)>1)
                    totalOrdering++;
                }
            }
            System.out.println(totalOrdering);
        }
    }

	private static int gcdOf(Integer a, Integer b) {
		// TODO Auto-generated method stub
		if(a%b==0)
			 return b;
		return gcdOf(b, a%b);
	}
}

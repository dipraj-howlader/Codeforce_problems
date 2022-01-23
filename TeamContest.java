import java.util.Scanner;
 
public class TeamContest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] ans = new int[3];
		int count =0;
		int temp =0;
		if(n>=1 && n<=1000) {
			
			//code here
			 for(int i = 1;i<=n;i++) {
				 for(int j=0;j<3;j++) {
					 ans[j] = input.nextInt();
				 }
 
				 if(ans[0] ==1 && ans[1]==1 && ans[2] ==1) {
					 count ++;
					 continue;
					 }
				 else if(ans[0]==1 && ans[1] ==1) 
					 count ++;
				 else if(ans[0]==1 && ans[2] ==1)
					 count ++;
				 else if(ans[1]==1 && ans[2] ==1)
					 count ++;
 
			 }
			 System.out.print(count);
			
		}
		
	}
}
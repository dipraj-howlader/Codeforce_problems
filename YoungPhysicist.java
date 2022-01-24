import java.util.Scanner;

public class YoungPhysicist {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if(n>=1&&n<=100) {
		//code here
			int[][] physics = new int[n][3];
			for(int row = 0;row<physics.length;row++) {
				for(int col = 0;col<physics[row].length;col++) {
					int value = a.nextInt();
					if(value>=-100 && value<=100) {
						physics[row][col] = value;
					}
				}
			}
			
			int x=0,y=0,z=0;
			for(int i=0;i<3;i++) {
				for(int j =0;j<physics.length;j++) {
					if(i==0) {
						x= x+physics[j][i];
					}
					else if(i==1) {
						y = y+physics[j][i];
					}
					else if(i==2) {
						z= z+physics[j][i];
					}
				}
			}
			if(z==0&&y==0&&x==0)
				System.out.print("YES");
			else 
				System.out.print("NO");
			
		}
	}
}

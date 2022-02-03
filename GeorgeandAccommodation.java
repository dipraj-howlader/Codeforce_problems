import java.util.Scanner;

public class GeorgeandAccommodation {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		int[] room = new int[2];
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<2;j++) {
				room[j] =inScanner.nextInt();
			}
			if(room[0]<=(room[1]-2)) {
				count++;
			}
			
		}
		System.out.print(count);

	}

}

import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String[] args) {
		Scanner is = new Scanner(System.in);
		int[] [] bea = new int[5][5];
	
		//init array
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               bea[i][j] = is.nextInt();
            }
        }
		
		// main code
		int a = 0,b = 0;
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if(bea[i][j]==1) {
            	   if(i>2)
            		   a= i -2;
            	   else
            		   a = 2-i;
            	   if(j>2)
            		   b= j -2;
            	   else
            		   b = 2-j;
               }
            }
        }
		int sum = a+b;
		System.out.print(sum);
		
	}
}

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class StringTask {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s =sc.nextLine() ;
			char[] up;
			up =s.toCharArray();

			for(int i = 0;i<up.length;i++) {
				up[0] = Character.toUpperCase(up[0]);
				System.out.print(up[i]);
			}
			
	}
}
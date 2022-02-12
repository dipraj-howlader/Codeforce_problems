import java.util.Arrays;
import java.util.Scanner;

/**
 * IWannaBetheGuy
 */
public class IWannaBetheGuy {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] array = new int[250];
        int n,p,q;
        n = iScanner.nextInt();
        p = iScanner.nextInt();
        for(int i=0;i<p;i++){
            array[i]=iScanner.nextInt();
        }
        q=iScanner.nextInt();
        for(int i=p;i<p+q;i++){
            array[i]=iScanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
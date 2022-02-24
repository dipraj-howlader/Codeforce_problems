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
        int[] array1 = new int[p+q];
        for(int i=0;i<p+q;i++){
            array1[i] = array[i];
        }
        int[] check = new int[n];
        for(int i=1;i<=n;i++){
            check[i-1] = i;
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<p+q;j++){
                if(check[i]==array1[j]){
                    count++;
                    break;
                }
            }
        }
        if(count ==n)
            System.out.println("I become the guy.");
        else
        System.out.println("Oh, my keyboard!");
        }
}
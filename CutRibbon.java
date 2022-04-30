import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int len = iScanner.nextInt();
        int haveAny = 0;
        boolean a = false;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = iScanner.nextInt();
            if (a == false && len % arr[i] == 0) {
                haveAny = arr[i];
                a = true;
            }
        }
        Arrays.sort(arr);
        // for(int i:arr)
        // System.out.println(i);

        int i = 0;
        int count = 0;
        if (haveAny != 0) {
            haveAny = len / haveAny;
        } 
            while (len > 0 && i!=3) {
                if (len % arr[i] == 0) {
                    while (len % arr[i] == 0) {
                        len = len - arr[i];
                        count++;
                        if (len <= 0) {
                            break;
                        }
                    }
                } else {
                    len = len - arr[i];
                    count++;
                }
                i++;
            if(i==3 && len>0)
            {
                count = 0;
                break;
            }
            }
          if(haveAny>count)
          System.out.println(haveAny);
          else
          System.out.println(count);
    
    }

}

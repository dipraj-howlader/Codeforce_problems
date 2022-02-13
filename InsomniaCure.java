import java.util.Scanner;

/**
 * InsomniaCure
 */
public class InsomniaCure {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] dragons = new int[4];
        int k = iScanner.nextInt();
        dragons[0] =k;
        int l = iScanner.nextInt();
        dragons[1] = l;
        int m = iScanner.nextInt();
        dragons[2] = m;
        int n = iScanner.nextInt();
        dragons[3]=n;

        int d = iScanner.nextInt();
        
        boolean[] counting = new boolean[d];
        for(int i=0;i<d;i++){
            counting[i]= false;
        }

        for(int j =0;j<4;j++){
            int takenValue = dragons[j];
            if(takenValue==1)
            {
                for(int i = takenValue;i<=d;i=i+1){
                    counting[i-1] = true;
                }
                break;
            }
            else{
            for(int i = takenValue;i<=d;i=i+takenValue){
                counting[i-1] = true;
            }
            }
        }

        // System.out.println("OKE");
        int count = 0;
                for(boolean x: counting)
                        if(x==false)
                        count++;
                        System.out.println(d-count);

    }
    
}
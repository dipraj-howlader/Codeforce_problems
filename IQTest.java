import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        int[] numbers = new int[test];
        for(int i=0;i<test;i++){
            numbers[i] = iScanner.nextInt();
        }
        int ZeroInd =0;
        int LIndex = test-1;
        int[] diff = new int[LIndex];
        for(int i=0;i<LIndex;i++){
            diff[i]= numbers[i+1]-numbers[i];
            if(diff[i]==0){
                ZeroInd++;
            }
        }
        if(ZeroInd>0){

        }
        else if(ZeroInd==0){}

        if((diff[0]!=diff[1]) && (diff[1] == diff[2])){
            System.out.println(1);
        }
        else if((diff[LIndex-1]!=diff[LIndex-2])&&(diff[LIndex-2]==diff[LIndex-3])){
            System.out.println(LIndex);
        }
        else{
            int commonDiff = diff[0];
            for(int i=1;i<LIndex;i++){
                if(commonDiff!=diff[i])
                {
                    System.out.println(i+2);
                    break;
                }
            }
        }

    }
}

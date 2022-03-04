import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        int firstValue, secondValue;
        if(number%2==0){
            firstValue = secondValue= number/2;
        }
        else
        {
            firstValue=number/2;
            secondValue = firstValue+1;
        }
        boolean checkF = true;
        boolean checkS = true;
        while(checkF==true&& checkS==true){
            int isFirst = isPrime(firstValue);
            int isSecond = isPrime(secondValue);
            if(isFirst == 1 || isSecond ==1){
                firstValue = firstValue-1;            
                secondValue = secondValue+1;
            }
            else{
                checkF = false;
                checkS = false;
            }
        }
        System.out.println(firstValue + " " + secondValue);
    }

    private static int isPrime(int n) {
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
            return 0;
            }
        }
        return 1;
    }
    
}

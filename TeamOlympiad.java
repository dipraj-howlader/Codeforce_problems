import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] numbers = new int[n];
        int fcount= 0;
        int scount =0;
        int tcount =0;
        for(int i = 0;i<n;i++){
            numbers[i] = iScanner.nextInt();
            if(numbers[i]==1)
            fcount++;
            else if(numbers[i]==2)
            scount++;
            else 
            tcount++;
        }
        int lowestOne = Integer.min(fcount, scount);
        int lowestTwo = Integer.min(scount, tcount);
        int lowest = Integer.min(lowestOne, lowestTwo);
        System.out.println(lowest);
        for(int i=1;i<=lowest;i++){
            int indexOne=0;
            int indexTwo=0;
            int indexThree =0;
            int count=0;
            int j=0;
            int one = 1;
            int two =2;
            int three =3;
            while(count!=3){
                if(numbers[j]==one){  
                    indexOne =j;
                    numbers[j] = 0;
                    count++;
                    one = -5;
                }
                else if(numbers[j]==two){
                    indexTwo=j;
                    numbers[j]=0;
                    count++;
                    two=-5;
                }
                else if(numbers[j]==three){
                    indexThree=j;
                    numbers[j]=0;
                    count++;
                    three = -5;
                }
                j++;
                
            }
            indexOne++;
            indexThree++;
            indexTwo++;
            System.out.println(indexOne +" "+ indexTwo +" "+indexThree);
        }
    }
}

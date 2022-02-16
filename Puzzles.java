import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int numberOfStudents = iScanner.nextInt();
        int numberOfPuzzles = iScanner.nextInt();
        int[] pieces = new int[numberOfPuzzles];
        if(numberOfPuzzles>=2 && numberOfPuzzles<=50 && numberOfStudents>=2 && numberOfStudents<=50){
        for(int i=0;i<numberOfPuzzles;i++){
            int piece = iScanner.nextInt();
            if(piece>=4 && piece<=1000)
            pieces[i] = piece;
        }
        }
        Arrays.sort(pieces);
        int minDif = 10000000;
        for(int i=1,j=0;i<=(numberOfPuzzles-numberOfStudents+1);i++){
            int A=pieces[(j+numberOfStudents-1)];
            int B = pieces[j];
            int different = A-B;
                if(different<minDif){
                    minDif=different;
                }
            j++;
        }
        if(minDif==10000000){
            System.out.print(0);
        }
        else
        System.out.println(minDif);
    }  
}

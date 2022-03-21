import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int totalSum = 0;
        for (int i = 0; i < test; i++) {
            int n = iScanner.nextInt();
            arr.add(n);
            totalSum = totalSum + n;
        }
        int sumSereja = 0;
        int len = arr.size();
        for (int i = 0; arr.size()!=0; i++) {
            int arrSize = arr.size();
            if (i % 2 == 0) {
                if (arr.get(0) > arr.get(arrSize - 1)) {
                    sumSereja = sumSereja + arr.get(0);
                    arr.remove(0);
                } else {
                    sumSereja = sumSereja + arr.get(arrSize - 1);
                    arr.remove(arrSize - 1);
                }
            } 
            else {
                if (arr.get(0) > arr.get(arrSize - 1)) {
                    arr.remove(0);
                } 
                else{
                    arr.remove(arrSize - 1);
                }
            }
        }
        System.out.println(sumSereja + " " + (totalSum - sumSereja));
    }
}

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = iScanner.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

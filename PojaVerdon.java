import java.util.Scanner;

public class PojaVerdon {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int[] arr = new int[n];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = iScanner.nextInt();
            sum = sum+arr[i];
        }
        System.out.println(sum);
        iScanner.close();
    }
}

import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int houses = iScanner.nextInt();
        int tasks = iScanner.nextInt();
        int[] numbers = new int[tasks];
        for(int i=0;i<tasks;i++){
            numbers[i] = iScanner.nextInt();
        }
        long count = numbers[0]-1;
        for(int i=1;i<tasks;i++){
            if(numbers[i]==numbers[i-1]){
                continue;
            }
            else if(numbers[i]<numbers[i-1]){
                int high = numbers[i-1];
                int low =  numbers[i];
                count = count + houses - high;
                count = count +  low;
            }
            else if(numbers[i]>numbers[i-1]){
                count = numbers[i] - numbers[i-1] +count;
            }
        }
        System.out.println(count);
    }
}

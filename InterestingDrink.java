import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner iScanner =new Scanner(System.in);
        int test = iScanner.nextInt();
        int[] prices = new int[test];
        for(int i = 0;i<test;i++){
            prices[i] = iScanner.nextInt();
        }
        int plansToBuy = iScanner.nextInt();
        Arrays.sort(prices);
        for(int i=1;i<=plansToBuy;i++){
            long num = iScanner.nextLong();
            long index = BinarySearch(prices, num);
            System.out.println(index);
        }

    }
    public static long BinarySearch(int[] arr , long a){  
        long length = arr.length;
        long mid = length/2;
        long first =0;
        long last = length-1;

         if(a<arr[0])
        return 0;
        else if(a>arr[(int) (length-1)])
        return length;
        else if(arr[(int) (length-1)]==a){
            return length;
        }
        else if(arr[(int) (length-2)]==a && length>99990)
        return length-1;
        else if(arr[(int) (length-3)]==a && length > 99990)
        return length-2;
        else {
        while(first<=last){
            if(arr[(int) mid] == a){
                int i = 1;
                if(mid+1==length){
                    return length;
                }
                else{
                while(arr[(int) (mid+i)]==a){
                    i++;
                    if(mid+i == length)
                    {
                        return length;
                    }
            }
            return mid+i;
        }
            
        }
            else if(a<arr[(int) mid]){
                last = mid -1;
                if(a> arr[(int) last])
                return mid;
            }
            else if(a>arr[(int) mid]){
                first = mid+1;
                if(a<arr[(int) first])
                return first;
            }
            mid = (first+last)/2;

        }

    }
    return 0;
    }
}

import java.util.Scanner;

public class DominantPiranha {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int n = iScanner.nextInt();
            boolean isEmpty = true;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = iScanner.nextInt();
                if(i>0){
                    if(arr[i]!=arr[i-1])
                    isEmpty = false;
                }
            }
                if(isEmpty)
                System.out.println(-1);
                else
                {
                    int min = Integer.MIN_VALUE;
                    int index = 0;
                    for(int i =0;i<arr.length;i++){
                        if(arr[i]>=min){
                            min = arr[i];
                        }
                    }
                    for(int i=0;i<arr.length;i++){
                        if(arr[i] ==min){
                            if(i==0){
                                if(min>arr[i+1]){
                                index = i;
                                break;
                                }
                            }
                            else if(i+1 == arr.length)
                            {
                                if(min>arr[i-1]){
                                index = i;
                                break;
                                }
                            }
                            else{
                                if(min>arr[i+1])
                                {
                                index = i;
                                break;
                                }
                                if(min>arr[i-1])
                                {
                                index = i;
                                break;
                                }
                            }
                        }
                    }
                    System.out.println(index+1);
                }
            }
        }
    }


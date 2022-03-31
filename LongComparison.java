import java.util.Scanner;

public class LongComparison {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            int[] first = new int[2];
            int[] sec = new int[2];
            for(int i=0;i<2;i++)
            first[i] = iScanner.nextInt();
            for(int i=0;i<2;i++)
            sec[i] = iScanner.nextInt();
            int one = String.valueOf(first[0]).length() ;
            int two = String.valueOf(sec[0]).length();

            if(one + first[1]> two + sec[1])
            System.out.println(">");
            else if(one + first[1]< two + sec[1])
            System.out.println("<");
            else{
            int power = Integer.min(first[1], sec[1]);
            first[1]-=power;
            sec[1]-=power;
            long sum1 = first[0] * (long)Math.pow(10, first[1]);
            long sum2 = sec[0] * (long)Math.pow(10, sec[1]);
            if(sum1>sum2)
            System.out.println(">");
            else if(sum1 == sum2)
            System.out.println("=");
            else if(sum1<sum2)
            System.out.println("<");
            }
        }
    }
}

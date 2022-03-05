import java.util.Scanner;

public class T_primes {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       int n = iScanner.nextInt();
       for(int i = 1;i<=n;i++){
        long number = iScanner.nextLong();
        String tprime = isTPrime(number);
        System.out.println(tprime);
       }
   }

private static String isTPrime(long number) {
    long length =String.valueOf(number).length();
    int count = 0;
    if(length>5){
        for(int i=2;i*i<number;i++){
            if(number%i==0)
            count++;
            if(count==2)
            break;
        }
    }
    else{
    for(long i=2;i<=number/2;i++){
        if(number%i==0)
        count++;
        if(count==2)
        break;
    }
}
    count = count +2;
    if(count==3)
    return "YES";
    else
    return "NO";
} 
}

import java.util.Scanner;
public class Dubstep
{
    public static void main(String[] args)
    {
        Scanner iScanner =new Scanner(System.in);
        String a=iScanner.next();
        System.out.println(a.replaceAll("WUB", " ").replaceAll(" +", " ").trim());
    }
}
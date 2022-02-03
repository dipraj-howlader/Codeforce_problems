import java.util.Scanner;
public class HQ9Plus 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        if(s.contains("H")||s.contains("Q")||s.contains("9"))
            System.out.println("YES");
        else if(s.contains("+")||s.contains("="))
            System.out.println("NO");
        else
            System.out.println("NO");
    }
}
    import java.util.Scanner;
    public class OddGrasshopper{
        public static void main(String[] args){
            Scanner iScanner = new Scanner(System.in);
            int test = iScanner.nextInt();
            while(test>0){
                test--;
                long intiPosition = iScanner.nextLong();
                long moves = iScanner.nextLong();
                long x =  moves%4;
                long n = 0;
                if(x==0)
                n=0;
                else if(x==1)
                n = -moves;
                else if(x==2)
                n = 1;
                else if(x==3)
                n = moves+1;

                if(intiPosition%2==0)
                System.out.println(intiPosition+n);
                else
                System.out.println(intiPosition-n);


            }
        }
    }
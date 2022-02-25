import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int inti = iScanner.nextInt();
        int n = iScanner.nextInt();
        int[][] dragon = new int[n][2];
        
        for(int i =0;i<n;i++){
            for(int j=0;j<2;j++){
                dragon[i][j] = iScanner.nextInt();
            }
        }
       int temp1 = 0;
       int temp2 = 0;
       for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(dragon[i][0]>dragon[j][0]){
                    temp1 = dragon[i][0];
                    temp2 = dragon[i][1];
                    dragon[i][0] = dragon[j][0];
                    dragon[i][1] = dragon[j][1];
                    dragon[j][0] = temp1;
                    dragon[j][1] = temp2;
                }
            }
       }

       int count = 0;
       for(int i=0;i<n;i++){
            int bonus =   dragon[i][1];
            int intiS = dragon[i][0];
            if(inti>intiS){
                count++;
                inti = inti+bonus;
            }
        }
        if(n == count)
        System.out.println("YES");
        else 
        System.out.println("NO");

    }
}

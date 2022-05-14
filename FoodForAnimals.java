import java.util.Scanner;

public class FoodForAnimals {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int test = iScanner.nextInt();
        while(test>0){
            test--;
            long a  =iScanner.nextLong();
            long b = iScanner.nextLong();
            long c = iScanner.nextLong();
            long dogs = iScanner.nextLong();
            long cats = iScanner.nextLong();
            long needcatsfood = 0;
            long needDogFood = 0;
            if(dogs>a){
                needDogFood = dogs-a;
            }
            if(cats>b){
                needcatsfood = cats-b;
            }
            long totalNeed = needDogFood+needcatsfood;
            if(totalNeed<=c){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}

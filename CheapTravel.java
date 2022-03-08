import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int ridesNeed = iScanner.nextInt();
        int specialRide = iScanner.nextInt();
        int normalRideCost = iScanner.nextInt();
        int specialRideCost = iScanner.nextInt();
        
        if(specialRide>ridesNeed){
            int oneRideMoney = ridesNeed*normalRideCost;
            if(oneRideMoney>specialRideCost)
            System.out.println(specialRideCost);
            else
            System.out.println(oneRideMoney);
        }
        else if(specialRide==ridesNeed){
            if(normalRideCost>specialRideCost){
                System.out.println(specialRideCost);
            }
            else
            System.out.println(normalRideCost);
        }
        else{
            int totalSp = ridesNeed/specialRide;
            int stay = ridesNeed%specialRide;

            if(ridesNeed*normalRideCost<specialRide*specialRideCost)
            {
              int huda = ridesNeed*normalRideCost;
                int total = totalSp*specialRideCost + stay*normalRideCost;
                if(normalRideCost>specialRideCost && stay!=0){
                    total = totalSp*specialRideCost + specialRideCost;
                }
                if(huda<total)
                System.out.println(huda);
                else
                System.out.println(total);
            }
            else{
                int total = totalSp*specialRideCost + stay*normalRideCost;
                if(normalRideCost>specialRideCost && stay!=0){
                    total = totalSp*specialRideCost + specialRideCost;
                }
                System.out.println(total);
            }

        }
        

        
    }
}

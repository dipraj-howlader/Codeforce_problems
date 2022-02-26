import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        String[] reg = new String[n];
        for(int i =0;i<n;i++){
            reg[i] = iScanner.next();
        }
        String[] finalReg = new String[n];
        int preFound = 0;
        int mark=0;
        for(int i =0;i<n;){
            String checkString = reg[i];
            for(int j =i-1; j>=0;j--){
                if(checkString.compareTo(reg[j])==0){
                    preFound = 1;
                    i++;
                    break;
                }

            }
            if(preFound==1){
                preFound = 0;
                continue;
            }
            
            else{
                finalReg[i] = "OK";
                int count=1;
                for(int j = i+1;j<n;j++){
                    if(checkString.compareTo(reg[j])==0){
                        finalReg[j] = checkString+String.valueOf(count);
                        count++;
                    }
                }
                count =1;
                i++;
                preFound = 0;
            }
            

        }
        for (String string : finalReg) {
            System.out.println(string);
        }

    }
}

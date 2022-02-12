import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        int count=1;
        int hak=1;
        for(int i=1;i<str.length();i++){
             if(Character.isLowerCase(str.charAt(0)) && Character.isUpperCase(str.charAt(i))){
                count++;
            }
            else if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(i))){
                hak++;
            }
        }
        if(count==str.length()){
            for(int i=0;i<str.length();i++){
                char one =str.charAt(i);
                if(Character.isLowerCase(one)){
                    System.out.print(Character.toUpperCase(one));
                }
                else 
                System.out.print(Character.toLowerCase(one));
            }
            
        }
        else if(hak ==str.length()){
            // System.out.print(Character.toUpperCase(str.charAt(0)));
            // for(int i=1;i<str.length();i++){
            //     System.out.print(Character.toLowerCase(str.charAt(i)));
            // }
            System.out.println(str.toLowerCase());
        }
        else if(str.length()==1) {
           System.out.print(str.toUpperCase());
        }
        else 
        System.out.print(str);
    }  
}

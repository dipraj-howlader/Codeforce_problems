import java.util.ArrayList;
import java.util.Scanner;

public class Dubstep {
   public static void main(String[] args) {
       Scanner iScanner= new Scanner(System.in);
       String song  = iScanner.nextLine();
       ArrayList<String> realSong = new ArrayList<String>();
       String addSong = new String();
       int count=1;
       for(int i=0;i<song.length();){
           if((i+1==song.length() || i+2==song.length())){
               addSong =String.valueOf(song.charAt(i));
                realSong.add(addSong);
                addSong = String.valueOf(song.charAt(i+1));
                realSong.add(addSong);
                break;
           }
           else if(song.charAt(i)=='W'&&song.charAt(i+1)=='U' && song.charAt(i+2)=='B'){
                i=i+3;
                if(count==0){
                    realSong.add(" ");
                    count++;
                }

           }
           else{
               addSong= String.valueOf(song.charAt(i));
               realSong.add(addSong);
               i++;
               count=0;
           }

       }
       for(String x: realSong)
       {
           System.out.print(x);
       }
   } 
}

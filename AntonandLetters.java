    import java.util.Scanner;

    public class AntonandLetters {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            String set = iScanner.nextLine();
            set = set.replace("{", "").replace("}", "").replaceAll(",", "").replaceAll(" ", "").trim();
            int count =0;
            for(int i=0;i<set.length();){
                String s = String.valueOf(set.charAt(i));
                set = set.replaceAll(s, "");
                count++;
                // System.out.println(set);
            }
            System.out.println(count);
        }
    }

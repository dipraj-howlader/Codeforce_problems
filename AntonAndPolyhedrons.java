import java.util.Scanner;

public class AntonAndPolyhedrons {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       int n = iScanner.nextInt();
       String[] Polyhedrons = new String[n];
       int count =0;
       for(int i=0;i<n;i++)
       {
           Polyhedrons[i] = iScanner.next();
       }
       for(int i =0;i<n;i++)
       {
           String oo = Polyhedrons[i];
        if(Polyhedrons[i].compareTo("Tetrahedron")==0)
        count = count +4;
        else if(Polyhedrons[i].compareTo("Cube")==0)
        count = count + 6;
        else if( Polyhedrons[i].compareTo("Octahedron")==0)
        count = count +8;
        else if(Polyhedrons[i].compareTo("Dodecahedron")==0)
        count = count +12;
        else if(Polyhedrons[i].compareTo("Icosahedron") ==0)
        count = count + 20;
       }
       System.out.println(count);

   } 
}

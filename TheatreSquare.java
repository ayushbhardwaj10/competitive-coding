import java.lang.* ;
import java.util.*;

public class TheatreSquare {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   double m = console.nextInt();
   double n = console.nextInt();
   double a = console.nextInt();

   long maxLimit = Integer.MAX_VALUE;
   
   double res1= Math.ceil(m/a);
   double res2 = Math.ceil(n/a);
   long r1= (long)res1;
   long r2 = (long)res2;
   long tempRes = r1*r2;
   System.out.println(tempRes);

 }
}
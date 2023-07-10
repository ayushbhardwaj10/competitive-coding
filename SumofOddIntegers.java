import java.lang.* ;
import java.util.*;

public class SumofOddIntegers {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   long t = console.nextLong();
   for(int i=0; i<t; i++){
    long n = console.nextLong();
    long k = console.nextLong();
    if(n%2==k%2 && n>=k*k)
     System.out.println("YES");
    else System.out.println("NO");
   }
   
 }
}
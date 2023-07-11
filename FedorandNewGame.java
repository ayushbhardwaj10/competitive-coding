import java.lang.* ;
import java.util.*;

public class FedorandNewGame {
 public static int countSetBits(int n){
   int count=0;
   while(n>0){
    if((n&1) == 1)
      count++;
    n=n>>1;
   }
   return count;
 }
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   int m = console.nextInt();
   int k = console.nextInt();
   int x[] = new int[m+1];
   for(int i=0; i<(m+1); i++){
     x[i] = console.nextInt();
   }
   int fedor = x[m];
   int count =0;
    // System.out.println("fedor :" + fedor);
   for(int i=0; i<m; i++){
    //  System.out.println("x[i]" + x[i]);
     int val = fedor ^ x[i];
    //  System.out.println("val :" + val);
     int setBitCount = countSetBits(val);
    //  System.out.println("val: "+ val+", set bits :" + setBitCount);
     if(setBitCount<=k)
      count++;
   }
   System.out.println(count);
 }
}
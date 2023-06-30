import java.lang.* ;
import java.util.*;

public class Laptops {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   TreeMap<Integer,Integer> map = new TreeMap<>();

   for(int i=0; i<n; i++){
     int a = console.nextInt();
     int b = console.nextInt();
     map.put(a,b);
   }
   int max = Integer.MIN_VALUE;
   int f=0;
   for(Map.Entry itr : map.entrySet()){
     //int a = (int)itr.getKey();
     int b = (int)itr.getValue();
     if(b>max){
        max = b;
     } 
     else if(b==max){
         continue;
     }
     else {
        System.out.println("Happy Alex");
        f=1;
        break;
     }
   }
   if(f==0)
     System.out.println("Poor Alex");
 }
}
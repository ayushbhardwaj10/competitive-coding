import java.lang.* ;
import java.util.*;

public class AandBandCompilationErrors {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   int a[] = new int[n];
   int c1[] = new int[n-1];
   int c2[] = new int[n-2];
   HashMap<Integer,Integer> m1 = new HashMap<>();
   HashMap<Integer,Integer> m2 = new HashMap<>();

   for(int i=0; i<n; i++){
      a[i] = console.nextInt();
      m1.put(a[i], m1.getOrDefault(a[i],0)+1);
      m2.put(a[i], m2.getOrDefault(a[i],0)+1);
   }
   for(int i=0; i<n-1; i++){
    c1[i] = console.nextInt();
    if(m1.get(c1[i])==1)
       m1.remove(c1[i]);
    else m1.put(c1[i],m1.get(c1[i])-1);
   }
   for(int i=0; i<n-2; i++){
    c2[i] = console.nextInt();
    if(m2.get(c2[i])==1)
      m2.remove(c2[i]);
    else m2.put(c2[i], m2.get(c2[i])-1);
   }
   int res1=0, res2=0;
   for(Map.Entry itr : m1.entrySet()){
     res1 = (int)itr.getKey();
   }
   System.out.println(res1);
   if(m2.get(res1)==1)
     m2.remove(res1);
   else m2.put(res1, m2.get(res1)-1);
   for(Map.Entry itr : m2.entrySet()){
    res2 = (int)itr.getKey();
   }
   System.out.println(res2);

 }
}
import java.lang.* ;
import java.util.*;

public class InterestingDrink {
 public static void main(String[] args) { 
  
   Scanner console = new Scanner(System.in); 
   int n = console.nextInt();
   int q;
   int prices[] = new int[n];

   HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
   int max = 0;
   for(int i=0; i<n; i++){
      prices[i] = console.nextInt();
      map.put(prices[i],map.getOrDefault(prices[i],0)+1);
      if(prices[i]>max)
       max = prices[i];
   }

   q = console.nextInt();
   int canSpend[] = new int[q];

   for(int i=0; i<q; i++){
      canSpend[i] = console.nextInt();
   }
   int dp[] = new int[max+1];
   dp[0]=0;
   for(int i=1; i<=max; i++){
     if(map.containsKey(i))
       dp[i] = map.get(i) + dp[i-1];
     else dp[i] = dp[i-1];
   }

   for(int i=0; i<canSpend.length; i++){
     if(canSpend[i]>max)
       System.out.println(dp[max]);
     else System.out.println(dp[canSpend[i]]);
   }
   
 }
}


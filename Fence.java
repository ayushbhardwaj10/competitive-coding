import java.lang.* ;
import java.util.*;

public class Fence {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   int k = console.nextInt();
   int heights[] = new int[n];
   for(int i=0; i<n; i++){
     heights[i] = console.nextInt();
   }
   int currSum=0;
   for(int i=0; i<k; i++){
      currSum = currSum + heights[i];
   }
   int minSum = currSum;
   int minStart = 0;
   int i=1;
   int j=k;
   while(j<n){
       currSum = currSum - heights[i-1] + heights[j];
       if(currSum<minSum){
          minSum = currSum;
          minStart = i;
       }
       i++;
       j++;
   }
   System.out.println(minStart+1);
 }
}
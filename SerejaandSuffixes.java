import java.lang.* ;
import java.util.*;

public class SerejaandSuffixes {
 public static void main(String[] args) { 
  
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    int m = console.nextInt();
    int a[] = new int[n];
    int l[] = new int[m];
    for(int i=0; i<n; i++){
        a[i] = console.nextInt();
    }
    for(int i=0; i<m; i++){
       l[i] = console.nextInt();
    }
    // System.out.println("done");
    int postFix[] = new int[n];
    HashMap<Integer,Integer> map = new HashMap<>();
    postFix[n-1] = 1;
    map.put(a[n-1],1);

    for(int i=n-2; i>=0; i--){
         if(map.containsKey(a[i]))
          postFix[i] = postFix[i+1];
         else {
          postFix[i] = postFix[i+1]+1;
          map.put(a[i],1);
         }
     }

    for(int index : l){
        System.out.println(postFix[index-1]);
    }


 }
}
import java.lang.*;

public class maximumSubWithNo3consecutive {
 public static void main(String[] args) { 

  int a[] = {6,4,9};
  int dp[] = new int[a.length];
  dp[0] = a[0];
  if(a.length>1){
      dp[1]= a[0] + a[1];
  }
  if(a.length>2){
    int val1 = a[0] + a[1];
    int val2 = a[1] + a[2];
    int val3 = a[0] + a[2];
    int max = Math.max(val1, val2);
    max = Math.max(max,val3);
    dp[2] = max;
  }
  if(a.length>3){
    for(int i=3; i<a.length; i++){
        int val1 = a[i]+a[i-1]+dp[i-3];
        int val2 = a[i] + dp[i-2];
        int val3 = dp[i-1];
        int max = Math.max(val1, val2);
        max = Math.max(max,val3);
        dp[i] = max;
    }
  }
  System.out.println(dp[a.length-1]);
 }
}
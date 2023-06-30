import java.lang.*;

public class matrixMul {
 public static void main(String[] args) { 

  int matrix[] = { 1, 2, 3, 4, 3 };
  long dp[][] = new long[matrix.length][matrix.length];
  
  long val = MatrixMul(matrix,1,matrix.length-1,dp);
  System.out.println(val);
   
 }
    private static long MatrixMul(int[] matrix,int i, int j,long dp[][]) {
   
    // Base case
    if(i>=j)
     return 0;
     
    // 2D DP  
    if(dp[i][j]>0)
     return dp[i][j];
     
    // Recursion 
    long min= Long.MAX_VALUE;
    for(int k=i; k<j; k++){
       long tempMin = MatrixMul(matrix,i,k,dp) + MatrixMul(matrix,k+1,j,dp) + matrix[i-1]*matrix[k]*matrix[j];
       if(tempMin<min)
        min=tempMin;
    }
     return dp[i][j]= min;
      
    }
}
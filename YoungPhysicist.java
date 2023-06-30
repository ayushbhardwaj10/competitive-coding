import java.lang.* ;
import java.util.*;

public class YoungPhysicist {
 public static void main(String[] args) { 
   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   int f[][] = new int[n][3];

   int sumX=0, sumY=0,sumZ=0;
   for(int i=0; i<n; i++){
      f[i][0] = console.nextInt();
      sumX = sumX +  f[i][0];

      f[i][1] = console.nextInt();
      sumY = sumY + f[i][1];

      f[i][2] = console.nextInt();
      sumZ = sumZ + f[i][2];
   }
//    System.out.println("sumX :" + sumX);
//    System.out.println("sumY :" + sumY);
//    System.out.println("sumZ :" + sumZ);
    if((sumX==sumY)&&(sumY==sumZ)&&(sumX==0))
      System.out.println("YES");
    else System.out.println("NO");
 }
}
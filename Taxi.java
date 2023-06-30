import java.lang.* ;
import java.util.*;

public class Taxi {
 public static void main(String[] args) { 

   Scanner console = new Scanner(System.in);
   int n = console.nextInt();
   int a[] = new int[n];
   for(int i=0; i<n; i++){
     a[i] = console.nextInt();
   }
   int count=0;
   Arrays.sort(a);
   int st = 0;
   int end = a.length-1;
   int seatsLeft = 4;
   while(st<=end){
        int first = a[st];
        int last = a[end];
        if(st==end){
            if(seatsLeft==4){
                 count++;
                 st++;
                 end--;
            } else {
                 if(first>seatsLeft){
                    count = count+2;
                    st++;
                    end--;
                 } else {
                    count++;
                    st++;
                    end--;
                 }
            }
            seatsLeft = 0;
        }
        else if(last==4){
            end--;
            count++;
        }
        else if(first+last>seatsLeft)
        {
           if(first>seatsLeft){
                 count++;
                 seatsLeft = 4;
           } else {
                 seatsLeft = seatsLeft - first;
                 if(seatsLeft==0){
                    count++;
                    seatsLeft=4;
                }
                st++;
           }
        }else {
            seatsLeft = seatsLeft-(first+last);
            if(seatsLeft==0){
                count++;
                seatsLeft=4;
            }
            st++;
            end--;
        }
   }
   if(seatsLeft>0 && seatsLeft!=4)
     count++;
   System.out.println(count);
   
 }
}
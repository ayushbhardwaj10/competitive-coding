import java.lang.* ;
import java.util.*;

public class StringTask {
 public static boolean isVowel(char ch){
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y')
      return true;
    else return false;
 }
 public static void main(String[] args) { 
    Scanner console = new Scanner(System.in);
    String s  = console.nextLine();
    s = s.toLowerCase();
    StringBuffer sb = new StringBuffer(s);
    int i=0;
    while(i<sb.length()){
        if(isVowel(sb.charAt(i))){
            sb.deleteCharAt(i);
        }
        else {
            sb.insert(i,'.');
            i=i+2;
        }
    }

    System.out.println(String.valueOf(sb));
 }
}
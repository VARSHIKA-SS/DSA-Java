
import java.util.*;
public class Palindromeno {
  public static boolean isNumberPalin(int no){
    int rev=0;
    int sum=no;
    while(no>0){
      rev*=10;
      rev+=no%10;
      no/=10;}
    if (rev==sum) return true;
    else return false;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    System.out.println(isNumberPalin(m));sc.close();
  }
}

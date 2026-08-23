package Numbers.Basic;
import java.util.*;
public class Reverse {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number : ");
  int n=sc.nextInt();
  int r=n;
  int rev=0;
  while(n>0){
    rev*=10;
    rev+=(n%10);
    n/=10;
  }
  System.out.print("The reverse of the number ("+r+") is : "+rev);
  sc.close();
  }
}

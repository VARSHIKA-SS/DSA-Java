package Numbers.Advanced;
import java.util.*;
public class Factorial {
  public static int fact(int f){
    if(f==0 || f==1) {return 1;}
    return f*(fact(f-1));
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the digit : ");
    int x=sc.nextInt();
    System.out.println(fact(x));
    sc.close();
  }
}

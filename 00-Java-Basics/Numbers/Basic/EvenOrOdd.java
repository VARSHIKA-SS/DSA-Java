package Numbers.Basic;
import java.util.*;
public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE NUMBER : ");
    int n=sc.nextInt();
    if((n&1)==0) System.out.println("IT'S A EVEN");
    else System.out.println("IT'S A ODD");
    sc.close();
  }
}

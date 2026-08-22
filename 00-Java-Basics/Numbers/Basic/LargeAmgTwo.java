package Numbers.Basic;

import java.util.*;

public class LargeAmgTwo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nm=sc.nextInt();
    if(n>nm) System.out.println("MAXIMUM : "+n);
    else System.out.println("MAXIMUM : "+nm);
    sc.close();
  }
}

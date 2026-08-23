package Numbers.Basic;
import java.util.*;
public class SumOfDigit {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Number : ");
  int n=sc.nextInt();
  int v=n;int sum=0;
  while(n!=0){
    sum+=(n%10);
    n=n/10;
  }
  System.out.println("The sum of "+v+" is : "+sum);
  sc.close();
}
}

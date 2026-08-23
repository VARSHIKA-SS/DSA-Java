package Numbers.Basic;
import java.util.*;
public class FirstAndLastDigit {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the Number : ");
  int n=sc.nextInt();
  int v=n;
  int count=0;
  while(n>0){
    count++;
    n/=10;
  }
  int o=1;
  for(int i=1;i<count;i++){o*=10;}
  System.out.println("First digt of "+v+" is : "+v/o+"\nLast  digt of "+v+" is : "+v%10);
  sc.close();
  }
}

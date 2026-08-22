package HashMap;
import java.util.*;
public class FirstRepElement {
  static void rep(int arr[]){
    HashMap<Integer,Integer> hp=new HashMap<>();
    for(int x:arr){
      if(hp.containsKey(x)) {System.out.println("The first repeating element is : "+x); return;}
      else hp.put(x,1); 
    }System.out.println("There is no repeating elements!");
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the size of the array : ");
  int n=sc.nextInt();
  System.out.print("Enter the elements of the array : ");
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  rep(arr);
  sc.close();
  }
}

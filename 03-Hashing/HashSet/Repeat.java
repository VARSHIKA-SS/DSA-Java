package HashSet;
import java.util.*;
public class Repeat {
  static HashSet<Integer> Rep(int arr[]){
    HashSet<Integer> hs=new HashSet<>();
    for(int x:arr){
      hs.add(x);
    }
    return hs;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE SIZE OF THE ARRAY : ");
    int s=sc.nextInt();
    int arr[]=new int[s];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(Rep(arr));
    sc.close();
  }
}

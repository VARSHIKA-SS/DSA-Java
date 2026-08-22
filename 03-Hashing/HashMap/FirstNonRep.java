package HashMap;
import java.util.*;
public class FirstNonRep {
  static int nonRep(int arr[]){
    HashMap<Integer,Integer> hp=new HashMap<>();
    for(int x:arr){hp.put(x,hp.getOrDefault(x,0)+1);}
    // for(int i=0;i<arr.length;i++){
    //   if(hp.containsKey(arr[i])){
    //     if(hp.get(arr[i])==1) {nonrep=arr[i]; return nonrep;}
    //   }
    // }return 0;
    // }
    for(int x:arr){if(hp.get(x)==1) return x;}
    return -1;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size : ");
    int s=sc.nextInt();
    System.out.print("Enter the "+s+" elements : ");
    int arr[]=new int[s];
    for(int i=0;i<s;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The first non-repeating element is " + nonRep(arr));
    sc.close();
  }
}

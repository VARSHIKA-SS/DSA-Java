import java.util.*;
public class ZeroAtEnd {
  static int[] EndZero(int arr[]){
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[j]=arr[i];
        j++;
      }
    }
    for(int i=j;i<arr.length;i++){arr[i]=0;}
    return arr;
     
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size : ");
    int s=sc.nextInt();
    System.out.print("Enter the elements : ");
    int arr[]=new int[s];
    for(int i=0;i<s;i++)arr[i]=sc.nextInt();
    System.out.println(Arrays.toString(EndZero(arr)));
    sc.close();
  }
}

import java.util.*;
public class RemoveZero {
  static int[] array(int arr[]){
    int j=0;
    for(int i=0;i<arr.length;i++){ if(arr[i]!=0){ arr[j]=arr[i];j++;}}
    return Arrays.copyOf(arr,j);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    System.out.println(Arrays.toString(array (arr)));
    sc.close();  
  }
}

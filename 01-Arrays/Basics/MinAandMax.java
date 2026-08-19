import java.util.*;
public class MinAandMax {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int min=0,max=0;
    System.out.print("Enter the size of Array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      max=arr[0];min=arr[0];
      if(arr[i]>max) max=arr[i];
      else if(arr[i]<min && arr[i]<max) min=arr[i];
    }System.out.print("MAX: "+max+" , MIN:"+min);
  }
}

import java.util.*;

public class SecLarge {
  public static int getSeclarge(int[] arr){
    int large=Integer.MIN_VALUE,seclarge=Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      if(arr[i]>large){
        seclarge=large;
        large=arr[i];
      }
      else if(arr[i]<large && arr[i]>seclarge){
        seclarge=arr[i];
      }
    }
    return seclarge;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter the elements of the array : ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(getSeclarge(arr));
    // Arrays.sort(arr); 
    // System.out.println(arr[n-2]);
    // THERE IS A DISADVANTAGE(WHEN NUMBERS ARE REPEATED, THIS IS NOT APPLICABLE)
     
    }
  }

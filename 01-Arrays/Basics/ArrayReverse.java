import java.util.*;
public class ArrayReverse {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size : ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
    int head=0;int tail=n-1;
    while(head!=tail){
      int temp=arr[head];
      arr[head]=arr[tail];
      arr[tail]=temp;
      head++;tail--;
    }
    System.out.println(Arrays.toString(arr));
  } 
}

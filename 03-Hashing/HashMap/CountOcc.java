package HashMap;
    import java.util.*;
    public class CountOcc {
      public static void main(String[] args) {
        HashMap<Integer,Integer> freqcount=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        for(int m:arr){
            freqcount.put(m,freqcount.getOrDefault(m,0)+1);
        }System.out.println(freqcount); 
        sc.close(); 
      }
    }

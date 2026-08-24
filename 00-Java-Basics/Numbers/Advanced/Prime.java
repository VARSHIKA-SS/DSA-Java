    package Numbers.Advanced;
    import java.util.*;
    public class Prime {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int c=0;
        if(n==0 || n==1){System.out.println("It's not a PRIME NUMBER");}
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){if(n%i==0){ prime=false; break;}}
        if(!prime) System.out.println("It's not a PRIME NUMBER");
        else System.out.println("It's a PRIME NUMBER");
        sc.close();
      }
    }

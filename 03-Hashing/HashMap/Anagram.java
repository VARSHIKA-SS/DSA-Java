package HashMap;
import java.util.*;
public class Anagram {
  static boolean ana(String n,String n2){
    if(n.length()==n2.length()){
    HashMap<Character,Integer> h1=new HashMap<>();
    for(int i=0;i<n.length();i++){h1.put(n.charAt(i),h1.getOrDefault(n.charAt(i),0)+1);}
    HashMap<Character,Integer> h2=new HashMap<>();
    for(int i=0;i<n2.length();i++){h2.put(n2.charAt(i),h2.getOrDefault(n2.charAt(i),0)+1);}
    if(h1.equals(h2)) return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the 1st String : ");
    String n=sc.nextLine();
    System.out.print("Enter the 2nd String : ");
    String n2=sc.nextLine();
    sc.close();

    if(ana(n,n2)) System.out.println("It's Anagram");
    else System.out.println("It's not Anagram!");
  }
}



import java.util.Scanner;

public class Palindrome {
  public static boolean ispalindrome(String a){
    int left=0,right=a.length()-1;
    while(left<right){
    if(a.charAt(left)!=a.charAt(right)){ return false;} left++;right--;}return true;
  }
    
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(ispalindrome(s));sc.close();
  }
}

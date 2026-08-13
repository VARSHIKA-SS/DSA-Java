package LinkedList;
import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;}
  }
public class SinglyLinkedList { // Declare head as a static variable
  static Node head;
  static void display(){
    Node current=head;
    while(current!=null){
      System.out.println(current.data);
      current=current.next;
    }
  }
  static void insertbegin(int data){
    Node newNode=new Node(data);
    if (head==null){
      head=newNode;
    }
    else{
      newNode.next=head;
      head=newNode;
    }
    
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      insertbegin(sc.nextInt());
    }
    display();
    sc.close();
  }
}

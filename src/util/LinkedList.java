package util;

import org.w3c.dom.Node;

public class LinkedList {

   public int data;
   private Node next;

   public LinkedList (int Data){
       this.data=data;
       this.next= null;
   }
public void setNextNode(Node node){
       this.next=node;
}
public Node getNextNode(){
       return this.next;
}
    }


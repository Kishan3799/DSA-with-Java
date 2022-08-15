import java.util.*;

 // Implementation of queue using Linkedlist

 class LinkedListQueue
 {
   //Queue Node class 
   static class Node
   {
     int data;
     Node next; 
     Node(int data){
       this.data = data;
       next = null;
     }
   }
   
   //Queue class 
   static class Queue
   {
     static Node head= null , tail = null;
     //isEmpty
     public static boolean isEmpty(){
       return head == null || tail == null;
     }
     
     //enqueue
     public static void add(int value){
       Node newNode = new Node(value);
       //checking list is empty
       if(isEmpty()){
         head = tail = newNode;
       }
       tail.next = newNode;
       tail = newNode;
       System.out.println("Inserted data is " + tail.data);
     }
     
     //dequeue
     public static int remove(){
       if(isEmpty()){
         System.out.println("Queue is Empty");
         return -1;
       }
       int front = head.data;
       // one node only
       if(head == tail){
         tail = null;
       }else{head = head.next;}
      // System.out.println("Deleted data is " + front);
       return front;
     }
     
     //peek 
     public static int peek(){
       if(isEmpty()){
         System.out.println("Queue is Empty");
         return -1;
       }
       return head.data;
     }

   }//end queue
   public static void main(String args[])
   { 
    Queue q = new Queue();
    
    q.add(10);
    q.add(20);
    q.add(30);
    
    // System.out.println("Front is "+q.peek());
    // q.remove();
    // System.out.println("Front is "+q.peek());
    // q.remove();
    // System.out.println("Front is "+q.peek());
    // q.remove();
    // System.out.println("Front is "+q.peek());

    while(!q.isEmpty()){
        System.out.print(" " + q.peek());
        q.remove();
    }

   }
 }
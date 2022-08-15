
 class StackLL{
  private static class Node {
     int data;
     Node next;
     
     Node(int data){
       this.data = data;
       Node next = null;  
     }
 }
 
   static class Stack{
     public static Node head = null;
     
     //add element in stack 
     public static void push(int value){
       Node newNode = new Node(value);
       if(head == null){
           head = newNode;
           return;
       }
       
       newNode.next = head;
       head = newNode;
     }
     
     public static boolean isEmpty(){
       if(head == null){
         return true;
       }
       return false;
     }
     
     public static int pop(){
        //check stack is empty
        if(isEmpty()){
          System.out.println("underflow condition");
          return-1;
        }
         Node top = head;   
         head = head.next;
         return top.data;       
     }
     
     public static int peek(){
       if(isEmpty()){
          System.out.println("underflow condition");
          return -1;
        }
        
        Node top = head;
        return top.data;
     }
     
   }
   public static void main(String args[]){
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        while(!stack.isEmpty()){
          System.out.println(stack.peek());
          stack.pop();
        }
   }
   
 }
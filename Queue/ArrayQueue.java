import java.util.*;

 //Implementation of Queue using Array

 class ArrayQueue{
   static class Queue{
    static int front;
    static int rear;
    static int size;
    static int arr[];
     
     Queue(int size){
       this.size = size;
       arr = new int[size];
       front = -1;
       rear = -1;
     }
   
   // isfull operation
  public static boolean isFull(){
     return rear == size -1;
   }
   
   //isEmpty operation
   public static boolean isEmpty(){
     return front == -1 || front > rear;
   }
   
   //Enqueue operation
   public static void add(int data){
      //checking queue is full
      if(isFull()){
        throw new IllegalStateException("Queue is OverFlow ");
      }
      if(front == -1){
        front = 0;
      }
      
      rear++;
      arr[rear] = data;
      System.out.println("Insert "+ arr[rear]);
    }
    
    //Dequeue operation
    public static int remove(){
      //check queue is empty
      if(isEmpty()){
       throw new IllegalStateException("Queue is UnderFlow");
      }
      
      int val = arr[front++];
      System.out.println("deleted " + val);
      return val;
      
    }
    
    
    public static int peek(){
      //check queue is empty
      if(isEmpty()){
       throw new IllegalStateException("Queue is UnderFlow");
      }
      
      return arr[front];
    }
   
    public static void display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(arr[i] + "  ");

      System.out.println("\nRear index-> " + rear);
    }
  }
 }
   
   public static void main(String args[]){ 
     Queue queue = new Queue(3);
     
     queue.add(10);
     queue.add(20);
     queue.add(30);
     
     System.out.println("first data in queue " + queue.peek());
     queue.display();
     
     queue.remove();
    System.out.println("first data in queue " + queue.peek());
     queue.display();
   }
 }
import java.util.*;

 //Implementation of Circular Queue using Array

 class CircularArrayQueue{
  static class Queue{
   static int front = -1;
   static int rear = -1;
   static int size;
   static int arr[];
     
     Queue(int size){
       this.size = size;
       arr = new int[size];
     }//end of constructor
   
   // isfull operation
  public static boolean isFull(){
     return (rear+1)%size == front;
   }//end
   
   //isEmpty operation
   public static boolean isEmpty()  {
        return front == -1 && rear == -1;
   }//end
   
   //Enqueue operation
   public static void add(int data){
      //checking queue is full
      if(isFull()){
        throw new IllegalStateException("Queue is OverFlow ");
      }
      //initialize front is 0
      if(front == -1){
        front = 0;
      }

      rear = (rear+1)%size;
      arr[rear] = data;
      System.out.println("Insert "+ arr[rear]);
    }//end 
    
    //Dequeue operation
    public static int remove(){
      //check queue is empty
      if(isEmpty()){
       throw new IllegalStateException("Queue is UnderFlow");
      }
      
      int val = arr[front];
      //only elem ent is present
      if(front == rear){
        front = rear = -1;
      }else{
        front = (front+1)%size;
      }
      //System.out.println("deleted " + val);  
      return val;
    }//end
    
    public static int peek(){
      //check queue is empty
      if(isEmpty()){
       throw new IllegalStateException("Queue is UnderFlow");
      }
      return arr[front];
    }
   
  //  public static void display() {
    /* Function to display elements of Queue */
   // int i;
    //if (isEmpty()) {
    //  System.out.println("Empty Queue");
   // } else {
    //  System.out.println("\nFront index-> " + front);
    //  System.out.println("Items -> ");
    //  for (i = front; i <= rear; i++)
    //    System.out.print(arr[i] + "  ");

    // System.out.println("\nRear index-> " + rear);
    //}
  }//end of static que class
    public static void main(String args[]){ 
     Queue q = new Queue(5);
     
     q.add(10);
     q.add(20);
     q.add(30);
     q.add(40);
     q.add(50);
     
     System.out.println("first data in queue " + q.peek());
     
     q.remove();
     q.remove();
     System.out.println("first data in queue " + q.peek());
     q.add(60);
     q.add(70);
     
     while(!q.isEmpty()){
       System.out.print(q.peek()+ " ");
       q.remove();
     }
   
   
   }
}

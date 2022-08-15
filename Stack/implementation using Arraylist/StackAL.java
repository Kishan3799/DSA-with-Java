import java.util.*;
 
 class StackAL {
   static class Stack{
     ArrayList<Integer> list = new ArrayList<>();
     
     public  void push(int data){
       list.add(data);
     }
     
     public  boolean isEmpty(){
       if(list.size()==0){
         return true;
       }
       return false;
     }
     
     public int pop(){
        if(isEmpty()){
          return -1;
        } 
        
        int top = list.remove(list.size()-1);
        return top;
     }
     
     public int peek(){
       if(isEmpty()){
          return -1;
        }
       
       return list.get(list.size()-1); 
       
     }
   } 
   public static void main(String args[]){ 
          Stack stack = new Stack();
          
          stack.push(10);
          stack.push(20);
          stack.push(25);
          stack.push(30);
          
          while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
          }
   }
 }

//Implementation using Array

class StackArray {
    int top;
    int arr[];
    int size;

    //creating stack constructor 
    StackArray(int size){
        arr = new int[size];
        this.size = size;
        top = -1;
    }

    //isEmpty Operation
    public boolean isEmpty(){
        return top == -1;
    }
    
    //push operation 
    public void push(int data){
        //check stack is full
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top]=data;
        System.out.println("insert " + data);
    }

    //pop operation
    public int pop(){
        //check stack is full
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        top--;
        return arr[top];
    }

    //peek Operation
    public int peek(){
        //check stack is full
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top];
    }

    public static void main(String[] args) {
     StackArray stack = new StackArray(3);
     
     stack.push(1);
     stack.push(2);
     stack.push(3);

     while(!stack.isEmpty()){
         System.out.println(stack.peek());
         stack.pop();
     }


    }
}
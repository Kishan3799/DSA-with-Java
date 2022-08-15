class Deque{
    int arr[];
    int front, rear, size;

    //Constructor 
    Deque(int size){
        arr = new int[size];
        front = -1;
        rear = 0;
        this.size = size;
    }

    //isFull operation 
    public boolean isFull() {
        return ((rear == size -1 && front == 0) || front == rear + 1);
    }

    //isEmpty operation
    public boolean isEmpty(){
        return front == -1;
    }

    //insert element at front 
    public void insertFront(int data){
        //checking Queue is full or not 
        if(isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        
        //Queue is empty
        if (front == -1){
            front = 0;
            rear = 0;
        }
        else if (front == 0){
            front = size - 1;
        }
        else {
            front--;
        }

        arr[front] = data;
    }

    //insert element at rear end 
    public void insertRear(int data){
        if(isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        //Queue is empty
        if (front == -1){
            front = 0;
            rear = 0;
        }
        else if (rear == size-1){
            rear = 0;
        }
        else {
            rear++;
        }

        arr[rear] = data;
    }

    //delete element at front 
    public void deleteFront(){
        //checking queue is empty or not
        if(isEmpty()){
            System.out.println("Queue is Underflow");
            return;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        }
        
        if(front == size -1){
            front = 0;
        }
        else{
            front++;
        }
    }
    
    //delete element at rear 
    public void deleteRear(){
        //checking queue is empty or not
        if(isEmpty()){
            System.out.println("Queue is Underflow");
            return;
        }

        if(front == rear){
            front = -1;
            rear = -1;
        }
        
        if(rear == 0){
            rear = size -1;
        }
        else{
            rear--;
        }
    }

    //return element at fornt 
    public int getFront(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Underflow");
        }
        return arr[front];
    }

    public int getRear(){
        if(isEmpty() || rear < 0){
            throw new IllegalStateException("Queue is Underflow");
        }
        return arr[rear];
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);

        System.out.println("Insert 5 at rear");
        dq.insertRear(5);
        System.out.println("Insert 10 at rear");
        dq.insertRear(10);
        System.out.println("Insert 15 at front");
        dq.insertFront(15);
        System.out.println("Insert 20 at front");
        dq.insertFront(20);

    }
}
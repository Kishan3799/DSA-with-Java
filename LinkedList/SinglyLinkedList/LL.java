public class LL {
    Node head; //head of the list.
    private int size;

    LL (){
        this.size = 0;
    }


    //create node of the list
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
        
    }

    //traverse in linked list
    public void traverse(){
        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
        }
    }
    
    //Insertion operation 
    
    //insertFirst
    public void insertFirst(int data){
        Node newNode = new Node(data); // Initi alize node 
        //list is empty
        if(head == null){
          head = newNode;
          return;
        }
        
        //list is not empty
        newNode.next = head;
        head = newNode;
        
    }
    
    //Insert Node at last
    public void insertLast(int data){
        Node newNode = new Node(data); //Initialize Node 
        //if list is empty than insert node 
        if (head == null){
            head = newNode;
            return;
        }
        
        //If list is not empty thab insert node at last of the list
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        
        lastNode.next = newNode;
    }

    //Insert Node Middle of linked list by given previous Node
    public void insertMiddle(Node prevNode , int data){
        if (prevNode == null){
            System.out.println("The given previous node can  not be null");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = prevNode.next;
     
        prevNode.next = newNode;
    }
    
    //Insert Node at Middle of linked list at given postion
    public void insert(int position , int data){
        // case 1 - invalid postion
        if(position > size || position < 0 ){
            System.out.println("Invalid position value enter valid postion");
            return;
        }
        
        //case 2 - linked list is empty head is pointed to null
        Node newNode = new Node(data);
        if(head == null && position == 0){
            newNode.next = head; 
            head = newNode;
            return;
        }


        // case 3 - linked list is not empty 
        Node currNode = head;
        for(int i = 1; i<size; i++ ){
            if(i==position){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
        // Node nextNode = currNode.next;
        //     currNode.next = newNode;
        //     newNode.next = nextNode;
    }
    
// Deletion on a linkedlist -----------------------------
   
    // 1. Deletion at beggining
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
        size--;
    }

    // 2.Deletion at last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        size--;

        if ( head.next == null){
            head=null;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
        
    }

    // Deletion at middle at given position
    public void delete(int position){
        //Input invalid position 
        if(position>size || position<0){
            System.out.println("Invalid position");
            return;
        }

        if(head == null){
            System.out.println("List is empty ");
            return;
        }
        
        size--;
        Node currNode = head;
        if( position == 0 ){
            head = currNode.next;
            return;
        }

        for( int i = 0; currNode != null && i<position-1; i++){
            currNode = currNode.next;
        }
        if(currNode == null || currNode.next == null)
            return;

        Node nextNode = currNode.next.next;
        currNode.next =nextNode;
    }

    //Search in linkedlist
    Boolean SearchNode(int value){
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == value)return true;
            currNode = currNode.next;
        }
        return false;
    }
     
    //Display list
    public void printList(){
        //list is empty
        if(head == null){
            System.out.println("List is Empty");
            
        }
        //list is not empty than print list
        
        System.out.print ("HEAD->");
        Node currNode = head;
        while(currNode  != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
        
    }

    public int getSize(){
        return size;
    }
    
    public static void main(String args[]) {
        //list is initialize
      LL list = new LL();

      System.out.println(list.getSize());
      list.printList();
      //addfirst
      list.insertFirst(30);
      list.insertLast(20);
      list.insert(2, 24);
      list.insert(1, 23);
      list.insert(2, 22 );

      list.printList();
      System.out.println(list.getSize());

      System.out.println(list.SearchNode(2));

    //   list.insertFirst(20);
    //   list.insertFirst(10);

    //   //addlast
    //   list.insertLast(40);
    //   list.insertLast(50);

    //   //addMiddle
    //   list.insertMiddle(list.head.next, 25);
    //   list.insertMiddle(list.head.next, 24);
    //   list.insertMiddle(list.head, 12);
     
    //   //addMiddle at given postion
    //   list.insert(3, 29);
    //   list.printList();
    //   System.out.println(list.getSize()); 
      
      //remove at first 
    //   list.deleteFirst();
    //   list.printList();
    //   System.out.println(list.getSize()); 
      
    //   //remove at last
    //   list.deleteLast();
    //   list.printList();
    //   System.out.println(list.getSize()); 
    
    //remove at given position
    // list.delete(3);
    // list.printList();
    //   System.out.println(list.getSize()); 

    // list.delete(5);
    // list.printList();
    //   System.out.println(list.getSize()); 

    // list.searchNode(24); 

    
    }
} 
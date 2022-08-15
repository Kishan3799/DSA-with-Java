//Implementaiton of Doubly linked list
class DLL {
    Node head; // Head of the list
    private static int size;// Size of the linked list 

    // default constructor
    DLL (){
        size = 0;
    }

    //Node class to create a new Node
    static class Node {
        int data;
        Node next;
        Node prev;

            Node(int data){
                this.data = data;
                this.next = null;
                this.prev = null;
                size++;
            }
    }

    //Get size method
    public int getSize(){
        System.out.print("Size is ");
        return size;
    }

    //display function to print list 
    public void display(){
        Node currNode = head;
        Node last = null;
        // list is empty
        if(head == null ){
            System.out.println("List is empty");
            return;
        }
        //while traversing forward direction
        System.out.println("Forwrd direction");
        while(currNode != null){
            System.out.print(currNode.data + "->");
            last = currNode;
            currNode = currNode.next;
        } 
        System.out.println("null");
        
        //while traversing backward direction
        System.out.println("BackWord direction");
        while(last != null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("null");

    }

    //Insertion Opertion ======================================================================
     
    //_____________Insert node at front in list

    public void insertAtFront(int data){
        Node newNode = new Node(data); //create a new Node for insert

        //list is empty
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        newNode.next = head;
        // newNode.prev = null;    

        if(head != null )
            head.prev = newNode;

        head = newNode;

    }

    //_________________Insert a Node after given node
    public void insertAfter(Node prevNode, int data){
        //make new node
        Node newNode = new Node(data);

        //list is empty
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        //checking given previou node is null 
        if(prevNode == null){
            System.out.println("The given previous node can not be null");
            return;
        }

        newNode.next = prevNode.next;
        
        prevNode.next = newNode;
        
        newNode.prev = prevNode;

        //checking next of newNode is null
        if(newNode.next != null)
             newNode.next.prev =newNode;

    }

      // Insert a node at end
    public void insertEnd(int data){
        
        Node newNode = new Node(data);

        // newNode.next = null;

        //checking list is empty
        if(head == null){
            // newNode.prev = null;
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        //add a node at last position
        lastNode.next = newNode;
        newNode.prev = lastNode;

    }

    //insert node before a node 
    public void insertBefore(Node nextNode , int data){
        Node newNode = new Node(data);

         //list is empty
         if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        //checking nextNode is null
        if(nextNode == null){
            System.out.println("NextNode can not be null");
            return;
        }

        // link connection of newnode 
        newNode.prev = nextNode.prev;
        
        nextNode.prev = newNode;

        newNode.next = nextNode;

        if(newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;
        
    }
     
    //Deletion Opertion ======================================================================

    // 1. Deletion at front 
    public void deleteFirst(){
        Node first = head;

        //list is empty 
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        //delete a node at first
        head = first.next;
        first.next.prev = null;

        size--; 

    }

    // 2. Delete node at end 
    public void deleteLast(){
        Node first = head;
        Node last =null;

        //if list is empty
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        
        //if one node is present in the list
        size--;
        if(first.next == null){
            head =null;
            return;
        }

        while(first != null){
            last = first;
            first = first.next;
        }

        last.prev.next = null;
        last.prev = null;

    }

    // Delete node after given node 
    public void deleteAtAfter(Node prevNode){
        //checking list is empty
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        //one node is present in list 
        if(head.next == null){
            head == null;
            return;
        }
        //two Node present in list 
        if(prevNode.next.next == null){
            prevNode.next == null;
            return;
        }
        //delete node after the given node 
        if(prevNode.next != null){
            prevNode.next.next.prev = prevNode.next.prev;
            prevNode.next = prevNode.next.next;
            //prevNode.next.prev = prevNode;
        }

    }

    public void deleteAtBefore(Node nextNode){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        size--;
        //checking prev of nextNode is not null
        if(nextNode.prev != null){
            nextNode.prev.prev.next = nextNode.prev.next;
            nextNode.prev = nextNode.prev.prev;
            // nextNode.prev.next = nextNode;
        }
    }

    public int searchNode(int NodeValue){
        Node currNode = head;
        int pos = 0;
        while(currNode.data != NodeValue && currNode.next != null){
            pos++;
            currNode = currNode.next;
        }
        if(NodeValue != currNode.data)
            return -1;

        return (pos +1);

    }
    public static void main(String[] args) {
        //Create a list
        DLL list = new DLL();

        //Create Node of linked List
        // Node one = new Node(1);
        // Node two = new Node(2);
        // Node three = new Node(3);

        //connect Node 
        // one.next = two;
        // one.prev = null;

        // two.next = three;
        // two.prev = one;

        // three.next = null;
        // three.prev = two;

        // //create one node as head
        // list.head = one;
        
        //Print list
        // list.display();
        // System.out.println(list.getSize());
        
        //Insert at Front
        // list.insertAtFront(1);
        // list.insertAtFront(2);
        // list.insertAtFront(3);

        
        // //Insert node after given node
        // list.insertAfter(list.head, 1);
        // list.insertAfter(list.head, 2);
        // list.insertAfter(list.head.next, 3);
        
        // // Insert node at the end 
        list.insertEnd(6);
        // list.insertEnd(7);
        // list.insertEnd(8);
        
        // //Insert Node at before the given Node
        // list.insertBefore(list.head, 7);
        // list.insertBefore(list.head, 8);
        
        // //Delete Node at first
        // list.deleteFirst();
        
        // //Delete Node from last
        // list.deleteLast();
        
        
        // //Delete Node after the given Node 
        list.deleteAtAfter(list.head);
        list.display();
        System.out.println(list.getSize());

        // //Delete Node before the given Node 
        // list.deleteAtBefore(list.head.next.next);
        // list.display();
        // System.out.println(list.getSize());

        // int result = list.searchNode(7);
        // System.out.println(" Node value found at  " + result + " position");

    }
}  
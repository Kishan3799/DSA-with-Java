class CLL{
    private Node head;
    private Node last;
    private static int length;


    public CLL() {
        this.head = null;
        this.last = null;
        this.length = 0;
    }
    
    public void getLength(){
        System.out.println(length);
    }

    // create a Node class 
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            length++;
        }

    }

    //Insert Node at head
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        // list is empty 
        if(head==null && last == null){
            head = newNode;
            last = newNode;
            return;
        }
        //list is not empty
        
        newNode.next = head;

        head = newNode;

        last.next = newNode;

    }
    //Insert Node at Last of the list
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        //List is empty
        if(head==null && last == null){
            head = newNode;
            last = newNode;
            return;
        }

        // list is not empty than add node at last
        Node lastNode = head;
        while(lastNode.next != head){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        newNode.next = head;

    }

    //Insert Node at middle of the linked list at given position
    public void insertMidAtIndx(int data, int index){
        Node newNode = new Node(data);
    
        //If index is invalid
        if(index>length || index<0){
            System.out.println("Invalid Index ! Enter valid index");
            return;
        }

        // If list is Empty 
        if(head == null && last == null || index == 0){
            newNode.next = newNode;
            head = newNode;
            last = newNode;
        }

        // if list is not empty then add a node at given index
        Node prevNode = head;
        for(int i = 1; i<length; i++){
            if(i==index){
                Node nextNode = prevNode.next;
                prevNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            prevNode = prevNode.next;
        }
    }
    
    // Delete Node at beginning 
    public void deleteAtBeg(){
        if(head == null && last == null){
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
        length--;
    }
    
    // Delete Node at last
    public void deleteAtLast(){
        if(head == null && last == null){
            System.out.println("List is already empty");
            return;
        }

        if(head.next == head){
            head = null;
        }
        length--;
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != head){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = head;
    }

    public void deleteMidAtInd(int index){
        // invalid position 
        if(index > length || index < 0){
            System.out.println("Invalid position");
            return;
        }

        if(head == null || last==null){
            System.out.println("List is empty");
            return;
        } 
        if(index == 0){
            head = head.next;
        }
        

        Node currNode = head;
        Node prevNode = head;
        for(int i=0; currNode.next != head && i<index-1; i++){
            currNode = currNode.next;
            prevNode = currNode;
        }
        if(currNode == head || currNode.next == head)
            return;

        prevNode.next = prevNode.next.next;


    }

    public void display(){
       Node currNode = head;
       if(head == null){
           System.out.println("list is empty");
           return;
       }
       do {
           System.out.print(currNode.data + " ");
           currNode = currNode.next;
       } while (currNode != head);
       System.out.println();
    }

    // Floyd's Cycle Detection Algorithm (Slow and fast pointer technique)

    public boolean cycleDetection(Node node){
        if(head == null && head.next == null){
            return false;
        }

        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast =  Fast.next.next;
            if(Slow == Fast){
                return true;
            }
        }

        return false;
    }

    // Starting point of Node cycle detect
    public Node cycleDetectionNode(Node node){
        if(head == null && head.next == null){
            return head;
        }

        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast =  Fast.next.next;
            if(Slow == Fast){
                return Slow;
            }
        }

        return null;
    }

    public int cycleDetectionNodeData(Node node){
        if(head == null && head.next == null){
            return 0;
        }

        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast =  Fast.next.next;
            if(Slow == Fast){
                return Slow.data;
            }
        }

        return 0;
    }

    public int detectNode(Node node){
        if(head == null && head.next == null){
            return 0;
        }
        Node meet = cycleDetectionNode(head);
        Node start = head;
        while(start != meet){
            start = start.next;
            meet = meet.next;
        }

        return start.data;
    }


    public static void main(String[] args) {
        CLL list = new CLL();

        // create Node 
        Node one = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        // connect node 
        // list.last = fourth;
       
        // third.next = list.last;
       
        // second.next = third;

        // one.next = second;
        
        // list.last.next = one;

        list.head = one;
        one.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        list.last = seventh;
        seventh.next = third;


        //Display the circular linked list 
        System.out.println("first list ");
        // list.display();
        // list.getLength();
        
        System.out.println(list.cycleDetectionNodeData(list.head));
        System.out.println(list.detectNode(list.head));
        
        // //Insert at first in CLL
        // System.out.println("New list after insert Node at beginning");
        // list.insertAtFirst(5);
        // list.insertAtFirst(6);
        // list.display();
        // list.getLength();


        // //Insert at last in CLL
        // System.out.println("New list after insert Node at last");
        // list.insertAtLast(7);
        // list.insertAtLast(8);
        // list.display();
        // list.getLength();
        
        // //Insert at middle in CLL
        // System.out.println("New list  after insert Node at Middle of list");
        // list.insertMidAtIndx(9, 2);
        // list.insertMidAtIndx(10, 3);
        // list.display();
        // list.getLength();
        
        // // Delete node at head 
        // System.out.println("New list  after delete Node at head");
        // list.deleteAtBeg();
        // list.display();
        // list.getLength();

        // // Delete node at last 
        // System.out.println("New list after delete Ndoe at last");
        // list.deleteAtLast();
        // list.display();
        // list.getLength();
        
        // //Delete Node at middle of the list at given index 
        // System.out.println("New list after delete middle of the list at given index");
        // list.deleteMidAtInd(0);
        // list.display();
        // list.getLength();

    }
}
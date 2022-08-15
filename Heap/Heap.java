
public class Heap {
    public int array[] = new int[100];
    public int size;
    
    public Heap (){
        size = 0;
        array[0] = -1;
    }

    //insertion in max heap
    public void insertHeap(int value){
        size = size +1;
        int index = size;
        array[index] = value;
        while (index > 1) {
            int parent = index/2;
            if(array[parent] < array[index]){
                int temp = array[index];
                array[index]= array[parent];
                array[parent] = temp;
               
                index = parent;
            }
            else {
                return;
            }
        }
    }

    // Insertion in Min heap 
    public void insertMinHeap(int value){
        size = size +1;
        int index = size;
        array[index] = value;
        while (index > 1) {
            int parent = index/2;
            if(array[parent] > array[index]){
                int temp = array[parent];
                array[parent]= array[index];
                array[index] = temp;   
                index = parent;
            }
            else {
                return;
            }
        }
        
    }

    // deletion in Max heap
    public void deleteMaxHeap(){
        if(size == 0){
            System.out.println("Not any node present to be deleted");
        }

        array[1] = array[size];

        size --;

        int i=1;
        while(i<size){
            int leftIndex = 2*i;
            int rightIndex = 2*i + 1;

            if(leftIndex < size && array[i] < array[leftIndex]){
                int temp = array[i];
                array[i] = array[leftIndex];
                array[leftIndex] = temp;

                i = leftIndex;
            }
            else if(rightIndex < size && array[i] < array[rightIndex]){
                int temp = array[i];
                array[i] = array[rightIndex];
                array[rightIndex] = temp;

                i = rightIndex;
            }
            else {
                return;
            }
        }
    }
    
    //deletion in min heap
    public void deleteMinHeap(){
        if(size == 0){
            System.out.println("Not any node present to be deleted");
        }

        array[1] = array[size];

        size --;

        int i=1;
        while(i<size){
            int leftIndex = 2*i;
            int rightIndex = 2*i + 1;

            if(leftIndex < size && array[i] > array[leftIndex]){
                int temp = array[i];
                array[i] = array[leftIndex];
                array[leftIndex] = temp;

                i = leftIndex;
            }
            else if(rightIndex < size && array[i] > array[rightIndex]){
                int temp = array[i];
                array[i] = array[rightIndex];
                array[rightIndex] = temp;

                i = rightIndex;
            }
            else {
                return;
            }
        }
    }
 

    

    

    public void printHeap(){
        for(int i=1; i<=size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Heap h = new Heap();

        //build max Heap
        // h.insertHeap(35);
        // h.insertHeap(33);
        // h.insertHeap(42);
        // h.insertHeap(10);
        // h.insertHeap(14);
        // h.insertHeap(19);
        // h.insertHeap(27);
        // h.insertHeap(44);
        // h.insertHeap(26);
        // h.insertHeap(31);

        // System.out.println("Before deletion");
        // h.printHeap();

        // h.deleteMaxHeap();

        // System.out.println("After Deletion");
        // h.printHeap();

        //build min heap
        h.insertMinHeap(35);
        h.insertMinHeap(33);
        h.insertMinHeap(42);
        h.insertMinHeap(10);
        h.insertMinHeap(14);
        h.insertMinHeap(19);
        h.insertMinHeap(27);
        h.insertMinHeap(44);
        h.insertMinHeap(26);
        h.insertMinHeap(31);

        System.out.println("MIN heap");
        h.printHeap();
        
        
        h.deleteMinHeap();

        System.out.println("After Deletion");
        h.printHeap();
       
    }
}
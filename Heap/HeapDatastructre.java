

public class HeapDatastructre {


    //Heapify of max heap
    static void max_heapify(int arr[], int n, int i){
        int largest = i;
        int leftIndex = 2*i;
        int rightIndex = 2*i+1;
        if(leftIndex <= n && arr[largest] < arr[leftIndex] )
            largest = leftIndex;
        if(rightIndex <= n && arr[largest] < arr[rightIndex] )
            largest = rightIndex;
        if(largest != i ){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            max_heapify(arr, n, largest );
        }
    }

    // heapify for min heap 
    static void min_heapify(int arr[], int n, int i){
        int smallest = i;
        int leftIndex = 2*i;
        int rightIndex = 2*i+1;
        if(leftIndex <= n && arr[smallest] > arr[leftIndex] )
            smallest = leftIndex;
        if(rightIndex <= n && arr[smallest] > arr[rightIndex] )
            smallest = rightIndex;
        if(smallest != i ){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            min_heapify(arr, n, smallest );
        }
    }
   

    // static void build_heap(int arr[], int n){
    //     for(int i = n/2; i> 0; i--){
    //         max_heapify(arr, i, n);
    //     }
    // }

    // static void printHeap(int[] arr, int n){
    //     for(int i = 1; i <= n; i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    // }
   

    public static void main(String[] args) {

       // int arr1[] = {-1,35,33,42,10,14,19,27,44,26,31};
        int arr2[] = {-1 ,10,8,9,7,6,5,4};
      
        int n = 7;

        // // build heap
        // for (int i=n/2; i>0; i--){
        //     max_heapify(arr1, n, i);
        // }
        // System.out.println("Build Max Heap");
        // for(int i = 1; i <= n; i++){
        //     System.out.print(arr1[i]+ " ");
        // }
      
        for (int i=n/2; i>0; i--){
            min_heapify(arr2, n, i);
        }
        
        System.out.println("Build Min Heap");
            
        for(int i = 1; i <= n; i++){
            System.out.print(arr2[i]+ " ");
         }
          


    }
}
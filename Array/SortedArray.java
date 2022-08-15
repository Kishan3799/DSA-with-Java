import java.util.Scanner;

public class SortedArray {
    // Traversed Operation on Array 
    public static void traverseArray(int arr[], int size){
        if(size == 0)
            System.out.println("Array is Empty");
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }

    
   //Insert Element it the kth postion




    public static void main(String args[]){
        //Create a Scanner class taking input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("******************Sorted Array****************");
        
        //****************Array iniatilize****************/
        System.out.println("Enter capacity of array");
        int capacity = sc.nextInt();
        
        int sortArray[] = new int[capacity];
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        // Input elements in a sorted array 
        for (int i=0; i<size; i++) {
            System.out.print("sortArray["+i+"] : ");
            sortArray[i]= sc.nextInt();
        }


        System.out.print("Your Entered array is : ");
        //Traversed operation on Sorted Array
        traverseArray(sortArray,size);

        // Insertion at the end of sorted array
        // int upperBond=size-1;
        // sortArray[upperBond+1] = 5;
        // System.out.println("Insert element at the end");
        // traverseArray(sortArray,size+1);
        

    }
}

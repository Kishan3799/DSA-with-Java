import java.util.Scanner;

public class Arrays {

    // Traversing in an array
    public void traverseArray(int[] arr, int size) {
        int i = 0; // index = i at postion which element stored in array
        while (i < size) {
            System.out.print(arr[i] + "  ");
            i++;
        }
    }

    // Inserting element array in the kth postion ;
    public static int insertindxArray(int arr[], int size, int capacity, int index, int element) {
        // check array is full
        if (size >= capacity) {
            System.out.println("Array is full");
            return -1;
        }
        //Elemnent insert inf array
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        return 1;
    }

    // Delete element in array at the specific postion of unsorted array
    public static int deletionInArray(int arr[], int size, int capacity, int postion) {
        //check array is empty
        if (size == 0) {
            System.out.println("Array is empty no element to delete");
            return -1;
        }
        // Deleting algo
        for (int i = postion; i <= size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return 1;

    }

    // Search element
    public static int searchElement(int arr[], int element) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    // Delete element in an unsotred array
    public static int deleteEleInArray(int arr[], int size, int element) {
        if (size == 0) {
            System.out.println("Array is empty no element to be delete");
            return -1;
        }
        int pos = searchElement(arr, element);
        // delete element
        // check array is empty
        if (size == 0) {
            System.out.println("Array is empty no element to delete");
            return -1;
        }
        // Deleting algo
        for (int i = pos; i <= size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return 1;
    }

    // Update
    public static int updateArray(int arr[], int element, int index) {
        return arr[index - 1] = element;
    }

    // Merage two unsorted array {by adding two array size}
    public static void merageArray(int arr1size, int arr2size, int[] arr1, int[] arr2) {
        int newArray[] = new int[20];
        int index = 0;
        int newSizeArray = arr1size + arr2size;
        for (int i = 0; i < arr1size; i++) {
            newArray[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2size; i++) {
            newArray[index] = arr2[i];
            index++;
        }
        int k = 0;
        while (k < newSizeArray) {
            System.out.print(newArray[k] + " ");
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capacity of storing elements in the array");
        int capacity = sc.nextInt();
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] myArray = { 10, 4, 6, 89, 78 }; // 1st type Iniatialzing of array
        int[] myArray2 = new int[5]; // 2nd type of iniatialzing of array
        myArray2[0] = 5; // and then inatialze element of the postion
        myArray2[1] = 55;
        myArray2[2] = 45;
        myArray2[3] = 65;
        int[] myArray3 = new int[capacity]; // 3rd type iniazlize array by keyboard inputs
        // Input array form keyboard
        for (int i = 0; i < size; i++) {
            System.out.print("myArray[" + i + "] = ");
            myArray3[i] = sc.nextInt();
        }

        // System.out.println("before deletion");
        // traverseArray(myArray3, size);

        // System.out.println("Enter Element to delete :- ");
        System.out.println("Enter Element to update :- ");
        int element = sc.nextInt();
        // System.out.println("after insertion");
        // insertindxArray(myArray3, size, capacity, 3, 15);

        System.out.println("after deletion");
        // deletionInArray(myArray3, size, capacity, 0);
        // deleteEleInArray(myArray3, size, element);
        // traverseArray(myArray3, size -= 1);
        // System.out.println(updateArray(myArray2, element, 3));
        // traverseArray(myArray2, size);
        merageArray(5, 4, myArray, myArray2);

        Arrays arr = new Arrays();
        arr.traverseArray(myArray3, size); // in class create method without static

    }
}
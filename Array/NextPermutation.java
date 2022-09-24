public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
    }

    public static void nextPermutation(int nums[]){
        int i = nums.length-2;
        while(i>=0 && nums[i+1] <= nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length -1;
            while(nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
        for (int ele : nums) {
            System.out.print(ele);
        }
    }

    //Swap the values in array
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Reverse the array
    public static void reverse(int arr[], int start){
        int i = start ,  j = arr.length - 1;
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }


}

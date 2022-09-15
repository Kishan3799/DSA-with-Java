import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


// 3Sum Question
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println("Three Sum Triplets are " + threeSumm(arr));
    }

    private static  List<List<Integer>> threeSumm(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        //sort the array
        Arrays.sort(arr);
        
        for(int i = 0; i<n-2; i++){
            if(i==0 || i>0 && arr[i] != arr[i-1]){
                int low = i+1;
                int high = n-1;
                int sum = 0-arr[i];

                while(low<high){
                    if(arr[low] +arr[high] == sum) {
                        res.add(Arrays.asList(arr[i], arr[low], arr[high]));
                        while(low < high && arr[low] == arr[low+1])low++;
                        while(low < high && arr[high] == arr[high -1])high--;
                        low++;
                        high--;  
                    }
                    else if(arr[low] +arr[high] >sum)high--;
                    else low++;
                }
            }
        }
        
        return res;
    }
}

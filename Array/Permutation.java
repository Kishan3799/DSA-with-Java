import java.util.*;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};   
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        return permutation(new ArrayList<>(),nums);
    }
    
    public static List<List<Integer>> permutation(List<Integer> p , int[] up ) {
        if(up.length==0){
            List<List<Integer>> sublist=new ArrayList<>();
            sublist.add(p);
            return sublist;
        }
        int num=up[0];
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=p.size();i++){
            List<Integer> new1=new ArrayList<>();
            new1.addAll(p.subList(0,i));
            new1.add(num);
            new1.addAll(p.subList(i,p.size()));
            ans.addAll(permutation(new1,Arrays.copyOfRange(up, 1, up.length)));
        }
        return ans;
    }

}

public class JumpGame {
    public static void main(String[] args) {
    
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpSteps(nums));
    }

    public static int jumpSteps(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        
        int maxSteps = 0;
        int cur=0;
        int jumpCount =0;
        
        for(int i=0; i<n-1; i++){
            maxSteps = Math.max(maxSteps, nums[i]+i);
                if(cur == i){
                    cur = maxSteps;
                    jumpCount++;
                }
            if(cur>n-1)return jumpCount;
        }
        
        return jumpCount;
    }
}

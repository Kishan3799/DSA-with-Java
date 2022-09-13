//Container with Most Water
public class CWMostWater {
   public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println("Max Water" + maxArea(height));
   } 
    public static int maxArea(int[] height) {
    int left = 0 , right = height.length - 1 , maxWater = 0;
    while ( left < right ) {
        int width = right -left;
        maxWater = Math.max(maxWater, Math.min(height[left], height[right])*width);
            if(height[left] <= height[right]) 
                left++;
            else
                right--;
        }
    
         return maxWater;
    }
}

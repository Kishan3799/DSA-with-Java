public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 5;
       int[][] ans = generateMatrix(n);

       for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
       }
    }
    public static int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];
        int count = 0;
        int total = n*n;
        
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = n;
        int endingCol = n;
        
        while(count<total){
            // right 
            for (int index = startingCol; count<total && index < endingCol; index++ ){
                ans[startingRow][index] = ++count;
            }
            startingRow++;
            
            // down
            for (int index = startingRow; count<total && index < endingRow; index++){
                ans[index][endingCol-1] = ++count;
            }
            endingCol--;
            
            // left
            for (int index = endingCol-1; count<total && index>=startingCol; index--){
                ans[endingRow-1][index] = ++count;
            }
            endingRow--;
            // up
            for (int index = endingRow-1; count<total && index>=startingRow; index--){
                ans[index][startingCol] = ++count;
            }
            startingCol++;
        }
        return ans;
    }
}

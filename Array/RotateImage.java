public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix =    {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        rotate(matrix);

        for(int row=0; row<matrix.length; row++){
                for(int col=0; col<matrix[row].length; col++){
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
    }

    public static void rotate(int matrix[][]) {
        for(int row=0; row<matrix.length; row++){
            for(int col=row; col<matrix[row].length; col++){
               int temp = 0;
               temp = matrix[row][col];
               matrix[row][col] = matrix[col][row];
               matrix[col][row] = temp;
            }
        }

        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length/2; col++){
                int temp = 0;
                temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix.length-1-col];
                matrix[row][matrix.length-1-col] = temp;
            }
        }
    }
}

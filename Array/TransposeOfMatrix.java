public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix =    {{1,2,3},
                            {4,5,6},
                            {7,8,9}};


        // for print of a matrix 
        // for(int row=0; row<matrix.length; row++){
        //     for(int col=0; col<matrix[row].length; col++){
        //         System.out.print(matrix[row][col]);
        //     }
        //     System.out.println();
        // }

        /**
         * Transpose of a matrix is change row into column or column into row 
         *  A[]mxn == A[]nxm
         */
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[col][row]);
            }
            System.out.println();
        }
    }
}

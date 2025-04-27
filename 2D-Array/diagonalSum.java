
public class diagonalSum {
    public static int DiagonalMatrixSum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum=sum+matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //                 sum=sum+matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){
            sum=sum +matrix[i][i];
            if(i != matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        System.out.println("Diagonal sum: " + DiagonalMatrixSum(matrix));         
    }
}

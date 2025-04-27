
public class stairCase {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]= {
            {1,2,3,4},
            {6,7,8,9,},
            {11,12,13,14},
            {16,17,18,19}
            };
        int key=33;
        stairCaseSearch(matrix,key);

    }
}

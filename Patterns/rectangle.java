public class rectangle {
    public static void hoolow_rectangle(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 || j==1 || i==totRows || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
        public static void main(String args[]){
        //     int n=5;
        //     int m=4;
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=m;j++){
        //             if(i==1||i==n|| j==1||j==m){
        //                 System.out.print("*");
        //             }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        hoolow_rectangle(4,5);
    }
}

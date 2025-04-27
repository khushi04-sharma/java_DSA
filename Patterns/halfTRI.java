public class halfTRI {
    public static void invertednum_triangle(int x){
        for (int i=1;i<=x;i++){
            for(int j=1;j<=x-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        invertednum_triangle(4);
    }
}

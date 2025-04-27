public class inverted {
    public static void inverted_triangle(int x){
        for (int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        inverted_triangle(4);
    }
}

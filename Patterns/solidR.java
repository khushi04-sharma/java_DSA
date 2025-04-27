public class solidR {
    public static void solidRhom(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        solidRhom(6);
    }
}

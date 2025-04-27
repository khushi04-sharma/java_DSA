public class hollowR {
    public static void hollowRhom(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                if(i==1||j==1||i==r||j==r){
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
        hollowRhom(6);
    }
}

import java.util.*;;

public class continuekey {
     public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        do{
            System.out.print("enter a number:");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
        while(true);
        
    }
}
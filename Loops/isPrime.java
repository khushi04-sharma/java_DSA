import java.util.*;

public class isPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.print("n is prime");
        }
        else{
            boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
            isprime=false;
        }
        }
        if(isprime==true){
            System.out.println("n is prime");
        }
        else{
            System.out.print("n is not prime");
        }
        }
        
    }
}

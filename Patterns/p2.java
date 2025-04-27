import java.util.*;
public class p2 {
    public static void main(String args[]){
        System.out.print("enter number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int star=1;star<=num-i+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


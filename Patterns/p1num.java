import java.util.Scanner;

public class p1num {
    public static void main(String args[]){
        System.out.print("enter number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int number=1;number<=i;number++){
                System.out.print(number);
            }
            System.out.println();
        }

    }
}

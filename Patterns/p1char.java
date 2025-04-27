import java.util.Scanner;

public class p1char {
    public static void main(String args[]){
        char ch='A';
        System.out.print("enter num:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int chars=1;chars<=i;chars++){
              System.out.print(ch);
              ch++;
            }
            System.out.println();
        }

    }
}

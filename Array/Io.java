import java.util.*;
public class Io {
     public static void main (String args[]){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        // int phy;
        // phy=sc.nextInt();

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy:" +marks[0]);
        System.out.println("che:" +marks[1]);
        System.out.println("math:" +marks[2]);


        int average=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("average: "+ average); 
        System.out.print("length of array =" +marks.length);

    //    marks[2]=marks[2] + 1;
    //    System.out.println("math:" +marks[2]);

    //    marks[2]=99;
    //    System.out.println("math:" +marks[2]);

    }
}


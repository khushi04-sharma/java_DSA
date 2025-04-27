import java.util.*;
public class argument {
    public static void update(int marks[],int nC){
        nC=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }
    public static void main (String args[]){
        int marks[]={89,78,98};
        int nC=5;
        update(marks,nC);
        System.out.println(nC);
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
    
}

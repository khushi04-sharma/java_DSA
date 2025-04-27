import java.util.*;
public class smallest {
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[]={1,5,3,6,4,2};
        System.out.println(getSmallest(numbers));
    }
}
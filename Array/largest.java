import java.util.*;
public class largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,5,3,6,4,2};
        System.out.println(getLargest(numbers));
    }
}

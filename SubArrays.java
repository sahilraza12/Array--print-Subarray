import java.util.*;
// print Subarrays 

public class SubArrays {

    public static void printSubarray(int numbers[]){
        int ts = 0; 
        
        for(int i=0; i<numbers.length; i++){
             for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){ //print 
                    System.out.print(numbers[k] + " "); //subarray
                }
                 ts++;
             System.out.println();
             }
             System.out.println();
        }
        System.out.println("Total Subarrays = " +ts);
    }



public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};

    printSubarray(numbers);
 }
}


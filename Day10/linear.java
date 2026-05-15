import java.util.*;
public class linear{
    public static int linear(int number[],int key){

        for(int i=0; i<number.length; i++){
            if(number[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;


        int index = linear(number,key);
        if(index== -1){
            System.out.println("Not Found");

        }else{
            System.out.println("key is at index :" + index);
        }
        
    }

}


//  largest of the number ----------------------------------

import java.util.*;
public class linear{
    public static int getlargest(int number[]){
        int largest = Integer .MIN_VALUE;

        for(int i=0; i<number.length; i++){
            if (largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest value is:" + getlargest(numbers));
    }
    

}
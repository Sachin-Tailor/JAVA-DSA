import java.util.*;
public class BitManipulation1{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            // even number 
            System.out.println("even number");

        }else{
            System.out.println("Odd number");

        }
    }


    // GetIthBit -
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n& bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    // SetIthBit - 
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;

    }

    // clearIthBit - 
     public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n | bitMask;

     }

    // updateIthBit - 
    //  method 1 
    //  public static int updateIthBit(int n , int i, int newBit){
    //     if(newBit == 0){
    //         return clearIthBit(n,i);
    //     }else{
    //         return setIthBit(n,i);
    //     }
    //  }
    
    // method 2 
    public static int updateIthBit(int n , int i, int newBit){
        n = clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask;

     }


    // clearIthBit - 
     public static int clearIBit(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;

     }


    public static void main (String args[]){
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);

        // System.out.println(getIthBit(10,2));

        // System.out.println(setIthBit(10,2));

        // System.out.println(clearIthBit(10,1));

        // System.out.println(updateIthBit(10,2,1));

        System.out.println(clearIBit(15,2));

    }
}
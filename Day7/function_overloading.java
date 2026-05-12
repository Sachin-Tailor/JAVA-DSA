import java.util.*;
public class function_overloading{
    // fun to calc int sum 
    public static int sum(int a , int b){

    return a + b;
    }
    //  fun to calc float sum
    public static float sum(float a , float b){

    return a + b ;
    }

    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.2f));
    }

}
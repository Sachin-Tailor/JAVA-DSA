

public class functions{
    public static void printHelloUniverse(){
        System.out.println("Hello Universe");
    }

    public static void main(String args[]){
        printHelloUniverse();
    }
}


// parameter-------------------------------------------------------------------------

import java.util.*;
public class functions{
    public static void printHelloUniverse(){
        System.out.println("Hello Universe");
    }

    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println("sum is :" + sum);


    }

    public static void main(String args[]){
        calculateSum();
    }
}




import java.util.*;
public class functions{
    public static void printHelloUniverse(){
        System.out.println("Hello Universe");
    }

    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum is :" + sum);


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculateSum(a,b);
    }
}


 int d = 0;
        for(int i =1; i<v.size();i++){
            if(v[i]) != v[d]{
                v[++d] = v[i];
            }
        }
        return(d+1);


        
// call by value-----------------------------------------------------------------


import java.util.*;
public class functions{
    public static void printHelloUniverse(){
        System.out.println("Hello Universe");
        System.out.println("Hello Universe");
        System.out.println("Hello Universe");
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;


    }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     calculateSum(a,b);
    // }
 


    //    method 1 for swap  --------------------------------------------------


    public static void main(String args[]){
        int a = 5;
        int b = 10;


        int temp = a;
        a = b ;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    // method 2 for swap--------------------------------------------------

    public static void swap(int a , int b){


        int temp = a;
        a = b ;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a,b);

    }

}


   
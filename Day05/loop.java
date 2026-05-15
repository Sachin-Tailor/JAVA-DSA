
import java.util.*;
public class loop{
    public static void main(String args[]){
        int counter = 0;
        while(counter < 10){

            System.out.println("Hello world");
            counter++ ;

        }
         System.out.println("I am sachin");
    }
}





// print number from one to 10 -----------------------------------------------------


import java.util.*;
public class loop{
    public static void main(String args[]){
        int counter = 1;
        while(counter <= 10){

            System.out.println(counter);
            counter++ ;

        }
    }
}



// print number from 1 to n ---------------------------------------------------------


import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        
        while(counter <= range){

            System.out.println(counter + " ");
            counter++ ;

        }
        System.out.println();
    }
}
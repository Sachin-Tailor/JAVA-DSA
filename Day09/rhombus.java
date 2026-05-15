
// inverted and rotate half pyramid

import java.util.*;
public class pattern_4{

    public static void floyd_triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
             System.out.print(counter+" ");
             counter++;
           }
           
          System.out.println();
        }
}   
    public static void main(String args[]){
        floyd_triangle(5);
    }

}




//  rhombus-----------------------------------------------------

import java.util.*;
public class rhombus{

    public static void rhombus(int n){
        
        for(int i=1; i<=n; i++){

         // space--
            for(int j=1; j<=(n-i); j++){
               System.out.print(" "); 
            }

         //star--
             for(int j=1; j<=n; j++){
                System.out.print("*"); 
               }
               System.out.println();
        }     
     
    }
          public static void main(String args[]){
           rhombus(5);
         }

}




// hollow rhombus pattern

import java.util.*;
public class rhombus{

    public static void rhombus(int n){
        
        for(int i=1; i<=n; i++){

         // space--
            for(int j=1; j<=(n-i); j++){
               System.out.print(" "); 
            }

         //star--
             for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){

                System.out.print("*"); 
                }
                else{
                    System.out.print(" "); 
                }
               }
               System.out.println();
        }     
     
    }
          public static void main(String args[]){
           rhombus(5);
         }

}
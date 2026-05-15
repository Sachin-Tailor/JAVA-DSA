
import java.util.*;
public class conditional{
    public static void main(String args[]){

        int age = 22;
        if(18<=age){
            System.out.println("eligible to vote ");
        }

        else{
            System.out.println("not eligible to vote ");
        }
        
    }
}


// -------------------------------------------------------------------------------


import java.util.*;
public class conditional{
    public static void main(String args[]){

        int age = 17;
        if(18<=age){
            System.out.println("eligible to vote ");
        }

        if(13<age && 18>age){
            System.out.println("teenager");
        }

        else{
            System.out.println("not eligible to vote ");
        }
        
    }
}




// print the largest of two numbers ---------------------------------------------


import java.util.*;
public class conditional{
    public static void main(String args[]){

        int a = 10;
        int b = 8;

        if (a>=b){
            System.out.println("a is the largest of 2");
        }

        else{
            System.out.println("b is the largest of 2");
        }
    }
}



// ------------------------------------------------------------------------------------


import java.util.*;
public class conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        

        if(income<500000){
            tax =0;
            
        }
        else if(income>=500000 && income<1000000){
            tax = (int) (income*0.2);
            
        }
        else{
            tax = (int) (income*0.3);

            
        }
         System.out.println("your tax is :" + tax);


    }
}




// Ternary operator--------------------------------------------------------------


import java.util.*;
public class ternary{
    public static void main(String args[]){

        int number = 5;

        // ternary operator
        String type = ((number%2)==0) ?"even": "odd";
        System.out.println(type);

    }
}



// pass or fail------------------------------------------------------------------

// method 1-----------------------------------------------------

import java.util.*;
public class ternary{
    public static void main(String args[]){

        int marks = 95;

        if(marks>=33){
            System.out.println("pass");
        }
        
        else{
             System.out.println("fail");

        }
    }
}


// method 2 --------------------------------------------------------------


import java.util.*;
public class ternary{
    public static void main(String args[]){

        int marks = 95;
        String reportcard = marks>=33? "pass":"fail";
        System.out.println(reportcard);
    }    
    
}



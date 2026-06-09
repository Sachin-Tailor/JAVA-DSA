import java.util.*;
public class BitManipulation{
    // And operator
    public static void main(String args[]){
        System.out.println(5&6);  
        // & ampercent
        // condition 1 and 1 is only 1 other are 0 

       // or operator 
       // condition 0 and 0 is only 0 other are 1
        System.out.println(5|6);

        // XOR opertor
        // condition 1,1 and 0,0 is only 0 other are 1
        System.out.println(5^6);

        // binary one's complement
        // also called NOT operator
        // condition is 0=1,1=0
        System.out.println(~5);

        // Binary left shift--
        // a<<b = a*2^b
        System.out.println(5<<2);

        // Binary right shift--
        // a>>b = a/2^b
        System.out.println(6>>1);

    }

    
    
}
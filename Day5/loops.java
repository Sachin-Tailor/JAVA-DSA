
// sum of first n natural numbers---------------------------------------------------


import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(" sum is " + sum);
    }
}




// do- while---------------------------------------------------------------------------


import java.util.*;
public class loops{
    public static void main(String args[]){
        int counter = 1;
        do{
            System.out.println("Hello world");
            counter++;

        }while(counter<=10);
    }
}




// break ----------------------------------------------------------------------------



import java.util.*;
public class loops{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            if (i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop ");

    }
}


//-----------------------------------------------------------------------------------------



import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number :");
            int n = sc.nextInt();
            if (n%10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}


// ---------------------------------------------------------------------------------------


import java.util.*;
public class loops{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
        if(i==3){
            continue;
        }
        System.out.println(i);
        }
    }
}





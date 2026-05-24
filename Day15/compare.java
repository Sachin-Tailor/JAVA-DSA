import java.util.*;
public class compare{
    public static void main(String args[]){
        String s1 = "tommy";
        String s2 = "tommy";
        String s3 = new String("tommy");

        if(s1 == s2){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");

        }


        if(s1 == s3){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");

        }
    }
}
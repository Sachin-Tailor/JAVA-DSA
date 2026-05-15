
// inverted and rotate half pyramid
import java.util.*;
public class pattern_2{

    public static void inverted_and_rotate_half_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i; j++){
             System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
             System.out.print("*");
            }
          System.out.println();
        }
}

    public static void main(String args[]){
        inverted_and_rotate_half_pyramid(4);
    }

}

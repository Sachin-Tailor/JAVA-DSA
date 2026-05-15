
// inverted half pyramid
import java.util.*;
public class pattern_3{

    public static void inverted_half_pyramid(int n){
        //outer
        for(int i=1; i<=n; i++){
          for(int j=1; j<=n-i+1; j++){
             System.out.print(j+" ");
           }
           
          System.out.println();
        }
}

    public static void main(String args[]){
        inverted_half_pyramid(5);
    }

}

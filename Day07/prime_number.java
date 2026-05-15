
import java.util.*;
public class prime_number{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
    public static void main(String args[]){
        System.out.println(isPrime(12));
        System.out.println(isPrime(72));
    }
    

}
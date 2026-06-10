public class pwer {

    static int power(int x, int n) {
        if(n == 0) return 1;

        int half = power(x, n / 2);
        int result = half * half;

        if(n % 2 != 0) {
            result = x * result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
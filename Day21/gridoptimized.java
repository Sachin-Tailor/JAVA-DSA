public class gridoptimized {

    static int factorial(int n) {
        int res = 1;
        for(int i = 1; i <= n; i++) res *= i;
        return res;
    }

    static int gridWays(int n, int m) {
        return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 3));
    }
}
public class grid {

    static int countWays(int i, int j, int n, int m) {

        if(i == n - 1 && j == m - 1) return 1;

        if(i >= n || j >= m) return 0;

        int down = countWays(i + 1, j, n, m);
        int right = countWays(i, j + 1, n, m);

        return down + right;
    }

    public static void main(String[] args) {
        System.out.println(countWays(0, 0, 3, 3));
    }
}
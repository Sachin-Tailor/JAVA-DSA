public class BigONotation {

    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // ignoring constants
        // 2n + 3 -> O(n)
    }
}
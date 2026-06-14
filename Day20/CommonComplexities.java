public class CommonComplexities {

    public static void main(String[] args) {

        int n = 5;

        // O(n)
        for(int i = 0; i < n; i++) {}

        // O(n^2)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {}
        }

        // O(log n)
        for(int i = 1; i < n; i *= 2) {}

    }
}
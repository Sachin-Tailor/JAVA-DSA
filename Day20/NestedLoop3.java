public class NestedLoop3 {

    public static void main(String[] args) {

        int n = 16;

        for(int i = 1; i < n; i *= 2) {
            for(int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }

        // O(n log n)
    }
}
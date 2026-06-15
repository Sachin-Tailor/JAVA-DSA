public class NestedLoop2 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        // ~ O(n^2 / 2) => O(n^2)
    }
}
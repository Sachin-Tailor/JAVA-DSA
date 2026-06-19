public class FindSubsets {

    static void subsets(String str, int i, String ans) {
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        // include
        subsets(str, i + 1, ans + str.charAt(i));

        // exclude
        subsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        subsets("abc", 0, "");
    }
}
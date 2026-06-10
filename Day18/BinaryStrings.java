public class BinaryStrings {

    static void printBin(int n, int last, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        printBin(n - 1, 0, str + "0");

        if(last == 0) {
            printBin(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBin(3, 0, "");
    }
}
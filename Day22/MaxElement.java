import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);

        int max = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
    }
}
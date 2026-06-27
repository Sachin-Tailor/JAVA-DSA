import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        int i = 0, j = 1;

        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

        System.out.println(list);
    }
}
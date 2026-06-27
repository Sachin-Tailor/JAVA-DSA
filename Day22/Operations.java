import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(1);
        list.add(2);
        list.add(3);

        // Get
        System.out.println(list.get(1));

        // Set
        list.set(1, 99);

        // Remove
        list.remove(2);

        System.out.println(list);
    }
}
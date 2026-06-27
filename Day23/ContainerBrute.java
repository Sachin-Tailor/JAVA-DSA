import java.util.ArrayList;

public class ContainerBrute {
    public static int maxWater(ArrayList<Integer> height) {
        int max = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int width = j - i;
                max = Math.max(max, h * width);
            }
        }
        return max;
    }
}
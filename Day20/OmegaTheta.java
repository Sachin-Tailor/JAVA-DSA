public class OmegaTheta {

    public static void main(String[] args) {

        int n = 10;

        // best case (Omega)
        if(n > 0) {
            System.out.println("Done");
        }

        // average case (Theta)
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
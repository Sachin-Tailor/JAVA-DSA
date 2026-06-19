public class Backtracking {

    static void changeArr(int arr[], int i, int val) {
        if(i == arr.length) {
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);

        // backtrack
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[3];
        changeArr(arr, 0, 1);
    }
}
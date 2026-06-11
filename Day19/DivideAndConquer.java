public class DivideAndConquer {

    // simple example using sum
    static int sum(int arr[], int start, int end) {
        if(start == end) {
            return arr[start];
        }

        int mid = (start + end) / 2;

        int left = sum(arr, start, mid);
        int right = sum(arr, mid + 1, end);

        return left + right;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        System.out.println(sum(arr, 0, arr.length - 1));
    }
}
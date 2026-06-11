public class RotatedArray {

    static int search(int arr[], int target, int low, int high) {
        if(low > high) return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == target) return mid;

        // left sorted
        if(arr[low] <= arr[mid]) {
            if(target >= arr[low] && target < arr[mid]) {
                return search(arr, target, low, mid - 1);
            } else {
                return search(arr, target, mid + 1, high);
            }
        }
        // right sorted
        else {
            if(target > arr[mid] && target <= arr[high]) {
                return search(arr, target, mid + 1, high);
            } else {
                return search(arr, target, low, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};

        System.out.println(search(arr, 0, 0, arr.length - 1));
    }
}
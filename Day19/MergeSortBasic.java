public class MergeSortBasic {

    static void merge(int arr[], int l, int mid, int r) {
        int temp[] = new int[r - l + 1];

        int i = l;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= r) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];

        // copy back
        for(int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        mergeSort(arr, 0, arr.length - 1);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
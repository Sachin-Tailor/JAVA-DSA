public class MergeSortCode {

    static void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    static void merge(int arr[], int l, int mid, int r) {
        int left[] = new int[mid - l + 1];
        int right[] = new int[r - mid];

        for(int i = 0; i < left.length; i++) {
            left[i] = arr[l + i];
        }

        for(int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while(i < left.length) arr[k++] = left[i++];
        while(j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 7, 3, 2};

        mergeSort(arr, 0, arr.length - 1);

        for(int x : arr) System.out.print(x + " ");
    }
}
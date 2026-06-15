public class MergeSortAnalysis {

    static void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // merging skipped (already covered)
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        mergeSort(arr, 0, arr.length - 1);

        // O(n log n)
    }
}
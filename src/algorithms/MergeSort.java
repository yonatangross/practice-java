package algorithms;

public class MergeSort {
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int leftSubArrayLen = mid - left + 1;
        int rightSubArrayLen = right - mid;

        int[] L = new int[leftSubArrayLen];
        int[] R = new int[rightSubArrayLen];

        if (leftSubArrayLen >= 0) System.arraycopy(arr, left, L, 0, leftSubArrayLen);
        for (int j = 0; j < rightSubArrayLen; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < leftSubArrayLen && j < rightSubArrayLen) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // add remaining items from left/right subArray.
        while (i < leftSubArrayLen) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < rightSubArrayLen) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

package LeetCode;

public class FastSort {
    public void fastSort(int[] arr, int l, int r) {
        if (l >= r) return;
        //作为基准值
        int temp = arr[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[j] > temp) j--;
            arr[i] = arr[j];
            while (i < j && arr[i] <= temp) i++;
            arr[j] = arr[i];
        }
        arr[i] = temp;
        fastSort(arr, l , i - 1);
        fastSort(arr, i + 1, r);
    }
}

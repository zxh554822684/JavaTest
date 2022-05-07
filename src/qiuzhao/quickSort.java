package qiuzhao;

import java.util.PriorityQueue;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSortFun(0, arr.length - 1, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSortFun(int left, int right, int[] arr) {
        if (left >= right) return;
        int base = arr[left];
        //核心代码
        int low = left;
        int high = right;
        while (low < high) {
            while (low < high && base <= arr[high]) high--;
            arr[low] = arr[high];
            while (low < high && base >= arr[low]) low++;
            arr[high] = arr[low];
        }
        arr[low] = base;
        quickSortFun(left, low - 1, arr);
        quickSortFun(low + 1, right, arr);
    }
}

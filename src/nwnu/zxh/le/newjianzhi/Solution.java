package nwnu.zxh.le.newjianzhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr == null || arr.length == 0) return new int[0];
        quickSort(arr, k, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }
    public void quickSort(int[] arr, int k, int left, int right) {
        if(left >= right) return;
        int base = arr[left];
        int i = left;
        int j = right;
        while(i < j) {
            while(i < j && arr[j] >= base) j--;
            arr[i] = arr[j];
            while(i < j && arr[i] <= base) i++;
            arr[j] = arr[i]; 
        }
        arr[i] = base;
        if(i > k) quickSort(arr, k, left, i - 1);
        if(i < k) quickSort(arr, k, i + 1, right); 
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

    }
}
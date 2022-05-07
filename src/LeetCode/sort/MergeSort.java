package LeetCode.sort;

public class MergeSort {
    // int[] arr = {2,4,1,3,6,9,8,7,11,10,41,13,5,6};
    int count = 0;
    public void mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, high, mid);
        }
    }

    // public void merge(int[] arr, int low, int high, int mid) {
    //     int[] temArr = new int[arr.length];
    //     for (int i = low; i <= high; i++) {
    //         temArr[i] = arr[i];
    //     }
    //
    //     int i = low, j = mid + 1, k = low;
    //
    //     for(; i <= mid && j <= high; k++) {
    //         if (temArr[i] < temArr[j]) {
    //             arr[k] = temArr[i++];
    //         }else {
    //             arr[k] = temArr[j++];
    //         }
    //     }
    //
    //     while (i <= mid) {
    //         arr[k++] = temArr[i++];
    //     }
    //     while (j <= high) {
    //         arr[k++] = temArr[j++];
    //     }
    // }
    public void merge(int[] nums, int low, int high, int mid) {
        int[] temArr = new int[nums.length];
        for(int i = low; i <= high; i++) {
            temArr[i] = nums[i];
        }
        int i = mid, j = high, k = high;
        for(;i >= low && j >= mid + 1; k--) {
            if(temArr[i] > temArr[j]) {
                nums[k] = temArr[i--];
                count += (j - mid);
            }else {
                nums[k] = temArr[j--];
            }
        }
        
        while(i >= mid) {
            nums[k--] = temArr[i--];
        }
        while(j >= mid + 1) {
            nums[k--] = temArr[j--];
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

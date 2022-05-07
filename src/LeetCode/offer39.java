package LeetCode;

public class offer39 {
    public int Partition(int[] nums, int start, int end) {
        if(start < end) {
            // 基准值
            int temp = nums[start];
            int i = start;
            int j = end;

            while(i < j) {
                while(i < j && nums[j] > temp) j--;
                nums[i] = nums[j];
                while(i < j && nums[i] <= temp) i++;
                nums[j] = nums[i];
            }
            
            nums[i] = temp;
            int middle = nums.length >> 1;
            if(i == middle) return temp;
            if(i < middle) return Partition(nums, i + 1, end);
            if(i > middle) return Partition(nums, start, j - 1);
        }
        return nums[start];
    }
}

package LeetCode;

public class offer53_1 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == target) {
                count++;
                int left = mid - 1;
                while(left >=0 && nums[left] == target) {
                    count++;
                    left--;
                }
                int right = mid + 1;
                while(right <= nums.length - 1 && nums[right] == target) {
                    count++;
                    right++;
                }
                break;
            }else if(nums[mid] > target) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return count;
    }
}

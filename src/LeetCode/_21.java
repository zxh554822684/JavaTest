package LeetCode;

public class _21 {
        public int[] exchange(int[] nums) {
            int front = 0;
            int rear = nums.length - 1;
            while(front < rear) {
                if(nums[front] % 2 == 0 && nums[rear] % 2 != 0) {
                    int temp = nums[front];
                    nums[front]  = nums[rear];
                    nums[rear] = temp;
                    front ++;
                    rear --;
                }
                if(nums[front] % 2 != 0) front++;
                if(nums[rear] % 2 == 0) rear--;
            }
            return nums;
        }
}

package LeetCode;

public class offer56_1 {
    public int[] singleNumbers(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        int wei = fun(a);
        int num1 = 0, num2 = 0;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i] >> wei;
            if((temp & 1) == 1) num1 ^= temp;
            else num2 ^= temp;
        }
        return new int[]{num1, num2};
    }
    // 用来计算二进制表示种1是倒数第几位
    public int fun(int num) {
        int count = 0;
        while(true) {
            //变成奇数的时候返回
            if((num & 1) == 1) return count;
            num >>= 1;
            count++;
        }
    }
}

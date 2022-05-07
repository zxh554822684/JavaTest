package LeetCode;

public class offer56_2 {
    public int singleNumber(int[] nums) {
        int[] digitSum = new int[32];

        for(int num : nums) {
            long mask = 1;
            for(int j = 31; j >= 0; j--) {
                int bit = (int) (num & mask);
                if(bit != 0)
                digitSum[j] += 1;
                mask <<= 1;
            }
        }

        int res = 0;
        for(int i = 0; i < 32; i++) {
            res <<= 1;
            res += (digitSum[i] % 3);
        }
        return res;
    }
}

package wy;

import javax.xml.transform.Source;
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, res, nums);
        return res;
    }
    public void dfs(int n, List<List<Integer>> res, int[] nums) {
        if(n == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
            return;
        }
        for(int i = n; i < nums.length; i++) {
            int temp = nums[n];
            nums[n] = nums[i];
            nums[i] = temp;
            dfs(n + 1, res, nums);
            temp = nums[n];
            nums[n] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 7,13};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.permute(nums);
        System.out.println(list);
    }
}

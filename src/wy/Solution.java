package wy;

import java.util.*;

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while(left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
            if(height[left] < height[right]) {
                res += leftMax - height[left];
                left++;
            }
            if(height[left] >= height[right]) {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,5};
        int left, ri = 0;
        Solution solution = new Solution();
        int trap = solution.trap(height);
        System.out.println(trap);
        System.out.println(123);
        System.out.println(456);
        System.out.println("3test");
    }
}
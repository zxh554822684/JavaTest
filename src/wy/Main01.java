package wy;

import java.util.Scanner;

public class Main01 {
    public static int max = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int j = 0; j < n; j++) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            int sum = fun(temp, j);
            if (max <= sum) max = sum;
        }
        System.out.println(max);
    }
    public static int fun(int[] nums, int start) {
        int[] temp = new int[nums.length - start];
        int index = 1;
        for (int i = start; i < nums.length; i++) {
            if (index % 2 == 0) nums[i] = -nums[i];
            temp[index - 1] = nums[i];
            index++;
        }

        int sum = maxSubArray(temp);
        return sum;
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}

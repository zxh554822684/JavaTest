package LeetCode.sort;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        // findContinuousSequence(9);
        test1();
    }
    public static  void test1() {
        int a = 2;

        if (a == 2) {
            System.out.println(11);
        }else if (a >= 2) {
            System.out.println(22);
        }else {
            System.out.println(33);
        }
    }

    public static int[][] findContinuousSequence(int target) {
        int i = 1, j = 2, s = 3;
        List<int[]> res = new ArrayList<>();
        while(i < j) {
            if(s == target) {
                int[] arr = new int[j - i + 1];
                for(int k = i; k <= j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
            }
            
            else if(s >= target) {
                s -= i;
                i++;
            }else {
                j++;
                s += j;
            }
        }
        return res.toArray(new int[0][]);
    }
}
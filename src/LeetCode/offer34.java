package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class offer34 {
    List<List<Integer>> resList = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return new ArrayList();
        int curSum = 0;
        pathSum(root, curSum, sum);
        return resList;
    }
    public void pathSum(TreeNode root, int curSum, int targetSum) {
        if(root == null) return;
        curSum += root.val;
        path.add(root.val);
        if(targetSum == curSum || root.left == null || root.right == null) {
            resList.add(new LinkedList(path));
        }
        pathSum(root.left, curSum, targetSum);
        pathSum(root.right, curSum, targetSum);
        path.removeLast();
    }
}

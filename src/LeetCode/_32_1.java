package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32_1 {
    public Integer[] levelOrder(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node =  queue.remove();
            list.add(root.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        //list转数组
        Integer[] arr = new Integer[list.size()];
        return list.toArray(arr);
    }
}

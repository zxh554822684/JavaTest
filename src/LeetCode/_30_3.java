package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.*;

public class _30_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<Integer> intList = null;

        while(!queue.isEmpty()) {
            intList = new LinkedList<>();
            // 如果是奇数层
            for(int i = queue.size(); i > 0; i--) {
                TreeNode tempNode = queue.poll();
                if((resultList.size() & 1) == 0) intList.addLast(tempNode.val);
                else intList.addFirst(tempNode.val);
                if(tempNode.left != null) queue.add(tempNode.left);
                if(tempNode.right != null) queue.add(tempNode.right);
            }
            resultList.add(intList);
        }

        return resultList;
    }
}
